package de.fraunhofer.isst.health.transit.spring.config;


import de.fraunhofer.isst.health.transit.message.*;
import de.fraunhofer.isst.health.transit.questionnaire.ConfirmArchiveListener;
import de.fraunhofer.isst.health.transit.service.merge.*;
import de.fraunhofer.isst.health.transit.service.trigger.*;
import de.medizininformatik_initiative.processes.common.util.DataSetStatusGenerator;
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
    private DmsFhirClientConfig dmsFhirClientConfig;

    @Autowired
    private DmsProjectFileFhirClientConfig dmsProjectFileFhirClientConfig;

    @Autowired
    private TransitVariablesConfig transitVariablesConfig;

    @Autowired
    private  GpasManagerConfig gpasManagerConfig;

    // all Processes

    /*
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public MimeTypeHelper mimeTypeHelper()
    {
        return new MimeTypeHelper(CombinedDetectors.fromDefaultWithNdJson(), api.getFhirContext());
    }
     */
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
        return new SendInitializeNewProjectDataSharing();
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public HandleErrorMergeReceiveDownloadInsert handleErrorMergeReceiveDownloadInsert()
    {
        return new HandleErrorMergeReceiveDownloadInsert();
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public HandleErrorMergeReceiveSendReceipt handleErrorMergeReceiveSendReceipt()
    {
        return new HandleErrorMergeReceiveSendReceipt();
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public HandleErrorMergeRelease handleErrorMergeRelease()
    {
        return new HandleErrorMergeRelease();
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public SendCreateStore sendCreateStore()
    {
        return new SendCreateStore();
    }

    //Transit

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public CreateProjectFileListener createProjectFileListener()
    {
        return new CreateProjectFileListener(
                gpasManagerConfig.gpasManager(gpasManagerConfig.domainManagerBeanService(),
                        gpasManagerConfig.psnManagerBeanService()),
                transitVariablesConfig, dmsProjectFileFhirClientConfig);
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public DownloadDataSetImplementation downloadDataSetImplementation()
    {
        return new DownloadDataSetImplementation(dmsProjectFileFhirClientConfig, transitVariablesConfig, dmsFhirClientConfig);
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public ValidateFHIRImplementation validateFHIRImplementation()
    {
        return new ValidateFHIRImplementation();
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public PseudonymizationImplementation pseudonymizationImplementation()
    {
        return new PseudonymizationImplementation(
                gpasManagerConfig.gpasManager(gpasManagerConfig.domainManagerBeanService(),
                gpasManagerConfig.psnManagerBeanService()), dmsFhirClientConfig);
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public InsertDataSetImplementation insertDataSetImplementation()
    {
        return new InsertDataSetImplementation(dmsProjectFileFhirClientConfig, transitVariablesConfig, dmsFhirClientConfig);
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public CreateCollectionBundleImplementation createCollectionBundleImplementation()
    {
        return new CreateCollectionBundleImplementation(dmsProjectFileFhirClientConfig, transitVariablesConfig);
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public CompleteProjectFileImplementation completeProjectFileImplementation()
    {
        return new CompleteProjectFileImplementation(dmsProjectFileFhirClientConfig);
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public ArchiveData archiveData()
    {
        return new ArchiveData(dmsProjectFileFhirClientConfig, transitVariablesConfig);
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public CreateArchiveStore createArchiveStore()
    {
        return new CreateArchiveStore(dmsProjectFileFhirClientConfig, transitVariablesConfig);
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public CheckQuestionnaireArchiveUrl checkQuestionnaireArchiveUrl()
    {
        return new CheckQuestionnaireArchiveUrl();
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public ConfirmArchiveListener confirmArchiveListener()
    {
        return new ConfirmArchiveListener(transitVariablesConfig.isDmsEmailEnabled());
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public CompleteDsfTaskListener completeDsfTaskListener()
    {
        return new CompleteDsfTaskListener();
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public SendTaskListener sendTaskListener()
    {
        return new SendTaskListener();
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public RecieveTaskListener recieveTaskListener()
    {
        return new RecieveTaskListener();
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public GetAndSendStoreUrlListener getAndSendStoreUrlListener()
    {
        return new GetAndSendStoreUrlListener();
    }


    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public DeleteFhirStore deleteFhirStore()
    {
        return new DeleteFhirStore();
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public ReadAndSaveStoreValues readAndSaveStoreValues() {
        return new ReadAndSaveStoreValues(dmsProjectFileFhirClientConfig);
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public ReleaseStoreDeletionQs releaseStoreDeletionQs() {
        return new ReleaseStoreDeletionQs();
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public CheckStoreDeletionQs checkStoreDeletionQs() {
        return new CheckStoreDeletionQs();
    }

//Trigger

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public CheckCloseProject checkCloseProject()
    {
        return new CheckCloseProject();
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public CheckNewProject checkNewProject()
    {
        return new CheckNewProject();
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public CheckNewData checkNewData()
    {
        return new CheckNewData(dmsFhirClientConfig);
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public SetTargetAndConfigureTimer setTargetAndConfigureTimer()
    {
        return new SetTargetAndConfigureTimer();
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public SendNewProject sendNewProject()
    {
        return new SendNewProject();
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public SendCloseProject sendCloseProject()
    {
        return new SendCloseProject();
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public SendNewData sendNewData()
    {
        return new SendNewData();
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public SetTarget setTarget()
    {
        return new SetTarget();
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public SetTargetAndCorrelationKey setTargetAndCorrelationKey()
    {
        return new SetTargetAndCorrelationKey();
    }

}
