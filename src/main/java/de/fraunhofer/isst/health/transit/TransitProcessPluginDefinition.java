package de.fraunhofer.isst.health.transit;

import de.fraunhofer.isst.health.transit.spring.config.DmsFhirClientConfig;
import de.fraunhofer.isst.health.transit.spring.config.GpasManagerConfig;
import de.fraunhofer.isst.health.transit.spring.config.TransitConfig;
import de.fraunhofer.isst.health.transit.spring.config.TransitVariablesConfig;
import dev.dsf.bpe.v2.ProcessPluginDefinition;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class TransitProcessPluginDefinition implements ProcessPluginDefinition
{
	public static final String VERSION = "1.0.0.2";
	public static final LocalDate RELEASE_DATE = LocalDate.of(2026, 5, 19);

	@Override
	public String getName()
	{
		return "mii-process-transit";
	}

	@Override
	public String getVersion()
	{
		return VERSION;
	}

	@Override
	public LocalDate getReleaseDate()
	{
		return RELEASE_DATE;
	}

	@Override
	public List<String> getProcessModels()
	{
		return List.of("bpe/transit.bpmn", "bpe/transit-trigger.bpmn");
	}

	@Override
	public List<Class<?>> getSpringConfigurations()
	{
		return List.of(TransitConfig.class, GpasManagerConfig.class, TransitVariablesConfig.class,
				DmsFhirClientConfig.class);
	}

	@Override
	public Map<String, List<String>> getFhirResourcesByProcessId()
	{

		var aMer = "fhir/ActivityDefinition/transit.xml";

		var cDaSh = "fhir/CodeSystem/data-sharing.xml";

		var eDaSeStEr = "fhir/StructureDefinition/extension-data-set-status-error.xml";

		var sEmedId = "fhir/StructureDefinition/extension-dic-identifier.xml";
		var sTinpds = "fhir/StructureDefinition/task-initialize-new-project-data-sharing.xml";
		var sTids = "fhir/StructureDefinition/task-inbox-data-set.xml";
		var sTdto = "fhir/StructureDefinition/task-dataset-time-out.xml";

		var vDaSh = "fhir/ValueSet/data-sharing.xml";

		var cDmuTools = "fhir/CodeSystem/dmu-tools.xml";
		var vDmuTools = "fhir/ValueSet/dmu-tools.xml";

		var aTrig = "fhir/ActivityDefinition/transit-trigger.xml";
		var sStart = "fhir/StructureDefinition/task-start-transit.xml";
		var sStop = "fhir/StructureDefinition/task-stop-transit.xml";

		var qStDel = "fhir/Questionnaire/questionnaire-store-deletion-confirmation.xml";


		return Map.of(ConstantsTransit.PROCESS_NAME_FULL_TRANSIT, //
				List.of(aMer, cDaSh, vDaSh, eDaSeStEr, sEmedId, sTinpds, sTids,sTdto, cDmuTools, vDmuTools, qStDel),
				ConstantsTransit.PROCESS_NAME_FULL_TRANSIT_TRIGGER, //
				List.of(aTrig, sStart, sStop));
	}
}
