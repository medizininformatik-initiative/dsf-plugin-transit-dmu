package de.fraunhofer.isst.health.transit.service.common;

import java.io.Serializable;

public interface ProfileService extends Serializable
{

	String getTransitProfile();

	String getTransitRestEndpoint();

	String getTransitNumEndpoint();

	String getCamundaRestEndpoint();

	String getDsfURL();

	String getDsfSocketURL();

	String getCertificatePathClient();

	String getCertificatePathPrivateKey();

	String getCertificatePathTestCa();

	String getCertifiatePassword();

	String getDsfInboxEndpointCamunda();

	String getDsfInboxEndpointTransit();

	String getDsfInboxLogLocation();

	String getFhirStoreControllerUrl();

	String getProjektakteUrl();

	String getResultStoragePath();

	String getBaseDownloadUrl();

	String getGitHubRepository();

	String getGithubBranch();

	String getGithubUsername();

	String getGithubCredentials();

	String getFileStorageUrl();

	String getFileStorageDatabase();

	String getFileStorageUser();

	String getFileStoragePassword();

	String getGpasUrl();

	int getPsnLength();
}
