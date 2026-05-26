package de.fraunhofer.isst.health.transit.spring.config;


import de.fraunhofer.isst.health.transit.message.*;
import de.fraunhofer.isst.health.transit.service.merge.*;
import de.fraunhofer.isst.health.transit.service.trigger.*;
import de.medizininformatik_initiative.processes.common.util.DataSetStatusGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
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

    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public DataSetStatusGenerator dataSetStatusGenerator()
    {
        return new DataSetStatusGenerator();
    }

    // mergeDataSharing

    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public SendInitializeNewProjectDataSharing sendInitializeNewProjectDataSharing()
    {
        return new SendInitializeNewProjectDataSharing();
    }

    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public HandleErrorMergeReceiveDownloadInsert handleErrorMergeReceiveDownloadInsert()
    {
        return new HandleErrorMergeReceiveDownloadInsert();
    }

    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public HandleErrorMergeReceiveSendReceipt handleErrorMergeReceiveSendReceipt()
    {
        return new HandleErrorMergeReceiveSendReceipt();
    }

    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public HandleErrorMergeRelease handleErrorMergeRelease()
    {
        return new HandleErrorMergeRelease();
    }

    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public SendCreateStore sendCreateStore()
    {
        return new SendCreateStore();
    }

    //Transit

    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public CreateProjectFileListener createProjectFileListener()
    {
        return new CreateProjectFileListener(
                gpasManagerConfig.gpasManager(gpasManagerConfig.domainManagerBeanService(),
                        gpasManagerConfig.psnManagerBeanService()),
                transitVariablesConfig, dmsProjectFileFhirClientConfig);
    }

    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public DownloadDataSetImplementation downloadDataSetImplementation()
    {
        return new DownloadDataSetImplementation(dmsProjectFileFhirClientConfig, transitVariablesConfig, dmsFhirClientConfig);
    }

    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public ValidateFHIRImplementation validateFHIRImplementation()
    {
        return new ValidateFHIRImplementation();
    }

    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public PseudonymizationImplementation pseudonymizationImplementation()
    {
        return new PseudonymizationImplementation(
                gpasManagerConfig.gpasManager(gpasManagerConfig.domainManagerBeanService(),
                gpasManagerConfig.psnManagerBeanService()), dmsFhirClientConfig);
    }

    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public InsertDataSetImplementation insertDataSetImplementation()
    {
        return new InsertDataSetImplementation(dmsProjectFileFhirClientConfig, transitVariablesConfig, dmsFhirClientConfig);
    }

    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public CreateCollectionBundleImplementation createCollectionBundleImplementation()
    {
        return new CreateCollectionBundleImplementation(dmsProjectFileFhirClientConfig, transitVariablesConfig);
    }

    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public CompleteProjectFileImplementation completeProjectFileImplementation()
    {
        return new CompleteProjectFileImplementation(dmsProjectFileFhirClientConfig);
    }

    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public ArchiveStore archiveStore()
    {
        return new ArchiveStore(dmsProjectFileFhirClientConfig, transitVariablesConfig);
    }

    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public CompleteDsfTaskListener completeDsfTaskListener()
    {
        return new CompleteDsfTaskListener();
    }

    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public SendTaskListener sendTaskListener()
    {
        return new SendTaskListener();
    }

    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public RecieveTaskListener recieveTaskListener()
    {
        return new RecieveTaskListener();
    }

    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public GetAndSendStoreUrlListener getAndSendStoreUrlListener()
    {
        return new GetAndSendStoreUrlListener();
    }


    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public DeleteFhirStore deleteFhirStore()
    {
        return new DeleteFhirStore();
    }

    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public ReadAndSaveStoreValues readAndSaveStoreValues() {
        return new ReadAndSaveStoreValues(dmsProjectFileFhirClientConfig);
    }

    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public ReleaseStoreDeletionQs releaseStoreDeletionQs() {
        return new ReleaseStoreDeletionQs();
    }

    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public CheckStoreDeletionQs checkStoreDeletionQs() {
        return new CheckStoreDeletionQs();
    }

//Trigger

    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public CheckCloseProject checkCloseProject()
    {
        return new CheckCloseProject();
    }

    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public CheckNewProject checkNewProject()
    {
        return new CheckNewProject();
    }

    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public CheckNewData checkNewData()
    {
        return new CheckNewData();
    }

    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public SetTargetAndConfigureTimer setTargetAndConfigureTimer()
    {
        return new SetTargetAndConfigureTimer();
    }

    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public SendNewProject sendNewProject()
    {
        return new SendNewProject();
    }

    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public SendCloseProject sendCloseProject()
    {
        return new SendCloseProject();
    }

    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public SendNewData sendNewData()
    {
        return new SendNewData();
    }

    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public SetTarget setTarget()
    {
        return new SetTarget();
    }

    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public SetTargetAndCorrelationKey setTargetAndCorrelationKey()
    {
        return new SetTargetAndCorrelationKey();
    }

}
