package de.fraunhofer.isst.health.transit.message;

import de.fraunhofer.isst.health.transit.ConstantsTransit;
import de.medizininformatik_initiative.processes.common.activity.RetryTaskSender;
import de.medizininformatik_initiative.processes.common.util.ConstantsBase;
import dev.dsf.bpe.v2.ProcessPluginApi;
import dev.dsf.bpe.v2.activity.MessageSendTask;
import dev.dsf.bpe.v2.activity.task.BusinessKeyStrategies;
import dev.dsf.bpe.v2.activity.task.TaskSender;
import dev.dsf.bpe.v2.activity.values.SendTaskValues;
import dev.dsf.bpe.v2.constants.NamingSystems;
import dev.dsf.bpe.v2.variables.Target;
import dev.dsf.bpe.v2.variables.Targets;
import dev.dsf.bpe.v2.variables.Variables;
import org.hl7.fhir.r4.model.*;
import org.springframework.beans.factory.InitializingBean;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class SendInitializeNewProjectDataSharing implements MessageSendTask, InitializingBean
{
	//private static final Logger logger = LoggerFactory.getLogger(SendInitializeNewProjectDataSharing.class);

	public SendInitializeNewProjectDataSharing() {
        super();
	}

    @Override
    public TaskSender getTaskSender(ProcessPluginApi api, Variables variables,
                                    SendTaskValues sendTaskValues) {
        return new RetryTaskSender(api, variables, sendTaskValues,
                BusinessKeyStrategies.SAME,
                (target) -> getAdditionalInputParameters(api, variables, sendTaskValues, target));
    }

    @Override
    public List<Task.ParameterComponent> getAdditionalInputParameters(ProcessPluginApi api,
                                                                      Variables variables, SendTaskValues sendTaskValues, Target target) {

        String projectIdentifier = variables
                .getString(ConstantsTransit.BPMN_EXECUTION_VARIABLE_PROJECT_IDENTIFIER);
        Task.ParameterComponent projectIdentifierInput = getProjectIdentifierInput(projectIdentifier);

        String contractUrl = variables.getString(ConstantsTransit.BPMN_EXECUTION_VARIABLE_CONTRACT_URL);
        Task.ParameterComponent contractUrlInput = getContractUrlInput(contractUrl);

        Stream<Task.ParameterComponent> otherInputs = Stream.of(projectIdentifierInput, contractUrlInput);

		List<String> researcherIdentifiers = variables
				.getStringList(ConstantsTransit.BPMN_EXECUTION_VARIABLE_RESEARCHER_IDENTIFIERS);
        Stream<Task.ParameterComponent> researcherIdentifierInputs = getResearcherIdentifierInputs(
                researcherIdentifiers);

        Targets targets = variables.getTargets();
        Stream<Task.ParameterComponent> dicIdentifierInputs = getDicIdentifierInputs(targets);

        return Stream.of(dicIdentifierInputs, otherInputs, researcherIdentifierInputs).flatMap(Function.identity())
                .toList();
    }


	@Override
	public void afterPropertiesSet()
	{
        //super.afterPropertiesSet();
		//Objects.requireNonNull(fhirClientFactory, "fhirClientFactory");
	}

	private Task.ParameterComponent getProjectIdentifierInput(String projectIdentifier)
	{
		Task.ParameterComponent projectIdentifierInput = new Task.ParameterComponent();
		projectIdentifierInput.getType().addCoding().setSystem(ConstantsTransit.CODESYSTEM_DATA_SHARING)
				.setCode(ConstantsTransit.CODESYSTEM_DATA_SHARING_VALUE_PROJECT_IDENTIFIER);
		projectIdentifierInput.setValue(new Identifier().setSystem(ConstantsBase.NAMINGSYSTEM_MII_PROJECT_IDENTIFIER)
				.setValue(projectIdentifier));

		return projectIdentifierInput;
	}

	private Task.ParameterComponent getContractUrlInput(String contractUrl)
	{
		Task.ParameterComponent contractUrlInput = new Task.ParameterComponent();
		contractUrlInput.getType().addCoding().setSystem(ConstantsTransit.CODESYSTEM_DATA_SHARING)
				.setCode(ConstantsTransit.CODESYSTEM_DATA_SHARING_VALUE_CONTRACT_URL);
		contractUrlInput.setValue(new UrlType(contractUrl));

		return contractUrlInput;
	}

	private Stream<Task.ParameterComponent> getResearcherIdentifierInputs(List<String> researchers)
	{
		return researchers.stream().map(this::transformToResearcherInput);
	}

	private Task.ParameterComponent transformToResearcherInput(String researcherIdentifier)
	{
		Task.ParameterComponent researcherIdentifierInput = new Task.ParameterComponent();
		researcherIdentifierInput.getType().addCoding().setSystem(ConstantsTransit.CODESYSTEM_DATA_SHARING)
				.setCode(ConstantsTransit.CODESYSTEM_DATA_SHARING_VALUE_RESEARCHER_IDENTIFIER);
		researcherIdentifierInput.setValue(new Identifier()
				.setSystem(ConstantsTransit.NAMINGSYSTEM_RESEARCHER_IDENTIFIER).setValue(researcherIdentifier));

		return researcherIdentifierInput;
	}

	private Stream<Task.ParameterComponent> getDicIdentifierInputs(Targets targets)
	{
		return targets.getEntries().stream().map(this::transformToInput);
	}

	private Task.ParameterComponent transformToInput(Target target)
	{
		Task.ParameterComponent dicIdentifierInput = new Task.ParameterComponent();
		dicIdentifierInput.getType().addCoding().setSystem(ConstantsTransit.CODESYSTEM_DATA_SHARING)
				.setCode(ConstantsTransit.CODESYSTEM_DATA_SHARING_VALUE_DIC_IDENTIFIER);
		dicIdentifierInput.setValue(new Reference()
				.setIdentifier(NamingSystems.OrganizationIdentifier.withValue(target.getOrganizationIdentifierValue()))
				.setType(ResourceType.Organization.name()));

		return dicIdentifierInput;
	}
}
