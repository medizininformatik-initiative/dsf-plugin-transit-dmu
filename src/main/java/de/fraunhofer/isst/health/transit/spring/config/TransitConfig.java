package de.fraunhofer.isst.health.transit.spring.config;


import de.fraunhofer.isst.health.transit.message.*;
import de.fraunhofer.isst.health.transit.service.merge.*;
import de.fraunhofer.isst.health.transit.service.trigger.*;
import de.medizininformatik_initiative.processes.common.mimetype.CombinedDetectors;
import de.medizininformatik_initiative.processes.common.mimetype.MimeTypeHelper;
import de.medizininformatik_initiative.processes.common.util.DataSetStatusGenerator;
import dev.dsf.bpe.v1.ProcessPluginApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "de.fraunhofer.isst.health.transit")
public class TransitConfig
{
    @Autowired
    private ProcessPluginApi api;

    @Autowired
    private DmsFhirClientConfig dmsFhirClientConfig;

    @Autowired
    private DmsProjectFileFhirClientConfig dmsProjectFileFhirClientConfig;

    @Autowired
    private TransitVariablesConfig transitVariablesConfig;

    @Autowired
    private  GpasManagerConfig gpasManagerConfig;

    // all Processes

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public MimeTypeHelper mimeTypeHelper()
    {
        return new MimeTypeHelper(CombinedDetectors.fromDefaultWithNdJson(), api.getFhirContext());
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public DataSetStatusGenerator dataSetStatusGenerator()
    {
        return new DataSetStatusGenerator();
    }

    // mergeDataSharing

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public SendInitializeNewProjectDataSharing sendInitializeNewProjectDataSharing()
    {
        return new SendInitializeNewProjectDataSharing(api, dmsFhirClientConfig.fhirClientFactory());
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public HandleErrorMergeReceiveDownloadInsert handleErrorMergeReceiveDownloadInsert()
    {
        return new HandleErrorMergeReceiveDownloadInsert(api);
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public HandleErrorMergeReceiveSendReceipt handleErrorMergeReceiveSendReceipt()
    {
        return new HandleErrorMergeReceiveSendReceipt(api);
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public HandleErrorMergeRelease handleErrorMergeRelease()
    {
        return new HandleErrorMergeRelease(api);
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public SendCreateStore sendCreateStore()
    {
        return new SendCreateStore(api);
    }

    //Transit

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public CreateProjectFileListener createProjectFileListener()
    {
        return new CreateProjectFileListener(api,
                gpasManagerConfig.gpasManager(gpasManagerConfig.domainManagerBeanService(),
                        gpasManagerConfig.psnManagerBeanService()),
                transitVariablesConfig, dmsProjectFileFhirClientConfig);
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public DownloadDataSetImplementation downloadDataSetImplementation()
    {
        return new DownloadDataSetImplementation(api, dmsProjectFileFhirClientConfig, transitVariablesConfig,
                dmsFhirClientConfig.fhirClientFactory());
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public ValidateFHIRImplementation validateFHIRImplementation()
    {
        return new ValidateFHIRImplementation(api);
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public PseudonymizationImplementation pseudonymizationImplementation()
    {
        return new PseudonymizationImplementation(api,
                gpasManagerConfig.gpasManager(gpasManagerConfig.domainManagerBeanService(),
                gpasManagerConfig.psnManagerBeanService()), dmsFhirClientConfig);
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public InsertDataSetImplementation insertDataSetImplementation()
    {
        return new InsertDataSetImplementation(api, dmsProjectFileFhirClientConfig, transitVariablesConfig, dmsFhirClientConfig);
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public CreateCollectionBundleImplementation createCollectionBundleImplementation()
    {
        return new CreateCollectionBundleImplementation(api, dmsProjectFileFhirClientConfig, transitVariablesConfig);
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public CompleteProjectFileImplementation completeProjectFileImplementation()
    {
        return new CompleteProjectFileImplementation(api, dmsProjectFileFhirClientConfig);
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public ArchiveStore archiveStore()
    {
        return new ArchiveStore(api, dmsProjectFileFhirClientConfig, transitVariablesConfig);
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public CompleteDsfTaskListener completeDsfTaskListener()
    {
        return new CompleteDsfTaskListener(api);
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public SendTaskListener sendTaskListener()
    {
        return new SendTaskListener(api);
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public RecieveTaskListener recieveTaskListener()
    {
        return new RecieveTaskListener(api);
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public GetAndSendStoreUrlListener getAndSendStoreUrlListener()
    {
        return new GetAndSendStoreUrlListener(api);
    }


    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public DeleteFhirStore deleteFhirStore()
    {
        return new DeleteFhirStore(api);
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public ReadAndSaveStoreValues readAndSaveStoreValues() {
        return new ReadAndSaveStoreValues(api, dmsProjectFileFhirClientConfig);
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public ReleaseStoreDeletionQs releaseStoreDeletionQs() {
        return new ReleaseStoreDeletionQs(api);
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public CheckStoreDeletionQs checkStoreDeletionQs() {
        return new CheckStoreDeletionQs(api);
    }

//Trigger

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public CheckCloseProject checkCloseProject()
    {
        return new CheckCloseProject(api);
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public CheckNewProject checkNewProject()
    {
        return new CheckNewProject(api);
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public CheckNewData checkNewData()
    {
        return new CheckNewData(api, dmsFhirClientConfig.fhirClientFactory());
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public SetTargetAndConfigureTimer setTargetAndConfigureTimer()
    {
        return new SetTargetAndConfigureTimer(api);
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public SendNewProject sendNewProject()
    {
        return new SendNewProject(api);
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public SendCloseProject sendCloseProject()
    {
        return new SendCloseProject(api);
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public SendNewData sendNewData()
    {
        return new SendNewData(api);
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public SetTarget setTarget()
    {
        return new SetTarget(api);
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public SetTargetAndCorrelationKey setTargetAndCorrelationKey()
    {
        return new SetTargetAndCorrelationKey(api);
    }

}
