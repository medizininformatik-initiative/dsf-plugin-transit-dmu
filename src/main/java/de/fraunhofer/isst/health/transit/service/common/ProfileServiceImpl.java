package de.fraunhofer.isst.health.transit.service.common;

import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProfileServiceImpl implements ProfileService
{

	public static final String TRANSIT_PROFILE_KUBERNETES = "kubernetes";

	private static final String TRANSIT_PROFILE = "transit_profile";
	private static final String DSF_INBOX_ENDPOINT_CAMUNDA = "dsf_inbox_url_camunda";
	private static final String DSF_INBOX_ENDPOINT_TRANSIT = "dsf_inbox_url_transit";
	private static final String DSF_INBOX_LOG_LOCATION = "dsf_inbox_log";
	private static final String TRANSIT_REST_ENDPOINT = "transit_rest_url";
	private static final String TRANSIT_NUM_ENDPOINT = "transit_rest_url_num";
	private static final String CAMUNDA_REST_ENDPOINT = "camunda_rest_url";
	private static final String DSF_URL = "dsf_url";
	private static final String DSF_SOCKET_URL = "dsf_socket_url";
	private static final String DSF_CERTIFICATES_PATH_CLIENT = "dsf_certificates_path_client";
	private static final String DSF_CERTIFICATES_PATH_PRIVATEKEY = "dsf_certificates_path_privatekey";
	private static final String DSF_CERTIFICATES_PATH_TESTCA = "dsf_certificates_path_testca";
	private static final String DSF_CERTIFICATES_PASSWORD = "dsf_certificates_password";
	private static final String FHIR_STORE_CONTROLLER_URL = "fhir_store_controller_url";
	private static final String PROJEKTAKTE_URL = "projektakte_url";
	private static final String RESULTSTORAGEPATH = "resultStoragePath";
	private static final String BASEDOWNLOADURL = "baseDownloadUrl";
	private static final String GITHUB_URL = "github_url";
	private static final String GITHUB_BRANCH = "github_branch";
	private static final String GITHUB_CREDENTIALS = "github_credentials";
	private static final String GITHUB_USERNAME = "github_username";
	private static final String FILE_STORAGE_URL = "file_storage_url";
	private static final String FILE_STORAGE_DATABASE = "file_storage_database";
	private static final String FILE_STORAGE_USER = "file_storage_user";
	private static final String FILE_STORAGE_PASSWORD = "file_storage_password";
	private static final String GPAS_URL = "gpas_url";
	private static final String GPAS_PSN_LENGTH = "gpas_psn_length";
	private final Logger logger = Logger.getLogger(this.getClass().getName());
	private final Properties properties;

	public ProfileServiceImpl()
	{
		try
		{
			String internalPropertyFilePath = "/properties/transit.properties";
			InputStream resourceAsStream = ProfileServiceImpl.class.getResourceAsStream(internalPropertyFilePath);
			if (resourceAsStream == null)
			{
				throw new RuntimeException("Could not find properties file: " + internalPropertyFilePath);
			}

			properties = new Properties();
			properties.load(resourceAsStream);
		}
		catch (IOException e)
		{
			logger.log(Level.WARNING, "Could not read properties file", e);
			throw new RuntimeException("Could not read properties file", e);
		}
	}

	private String getPropertySafe(String key)
	{
		// Search system/docker environment variables first. This will override default values from the pom properties
		String property = System.getenv(key);
		if (property != null && !property.isEmpty())
		{
			return property;
		}
		// Depending on the operating system getEnv can be case-sensitive
		// Generally ENV variables are written with uppercase letters so this is checked as well
		property = System.getenv(key.toUpperCase(Locale.ROOT));
		if (property != null && !property.isEmpty())
		{
			return property;
		}
		// System/docker environment variable not found. Search in pom properties
		property = properties.getProperty(key);
		if (property != null)
		{
			return property;
		}

		throw new RuntimeException("Could not find property: " + key);
	}

	@Override
	public String getTransitProfile()
	{
		return getPropertySafe(TRANSIT_PROFILE);
	}

	@Override
	public String getTransitRestEndpoint()
	{
		return getPropertySafe(TRANSIT_REST_ENDPOINT);
	}

	@Override
	public String getTransitNumEndpoint()
	{
		return getPropertySafe(TRANSIT_NUM_ENDPOINT);
	}

	@Override
	public String getCamundaRestEndpoint()
	{
		return getPropertySafe(CAMUNDA_REST_ENDPOINT);
	}

	@Override
	public String getDsfURL()
	{
		return getPropertySafe(DSF_URL);
	}

	@Override
	public String getDsfSocketURL()
	{
		return getPropertySafe(DSF_SOCKET_URL);
	}

	@Override
	public String getCertificatePathClient()
	{
		return getPropertySafe(DSF_CERTIFICATES_PATH_CLIENT);
	}

	@Override
	public String getCertificatePathPrivateKey()
	{
		return getPropertySafe(DSF_CERTIFICATES_PATH_PRIVATEKEY);
	}

	@Override
	public String getCertificatePathTestCa()
	{
		return getPropertySafe(DSF_CERTIFICATES_PATH_TESTCA);
	}

	@Override
	public String getCertifiatePassword()
	{
		return getPropertySafe(DSF_CERTIFICATES_PASSWORD);
	}

	@Override
	public String getFhirStoreControllerUrl()
	{
		return getPropertySafe(FHIR_STORE_CONTROLLER_URL);
	}

	@Override
	public String getProjektakteUrl()
	{
		return getPropertySafe(PROJEKTAKTE_URL);
	}

	@Override
	public String getResultStoragePath()
	{
		return getPropertySafe(RESULTSTORAGEPATH);
	}

	@Override
	public String getBaseDownloadUrl()
	{
		return getPropertySafe(BASEDOWNLOADURL);
	}

	@Override
	public String getDsfInboxEndpointCamunda()
	{
		return getPropertySafe(DSF_INBOX_ENDPOINT_CAMUNDA);
	}

	@Override
	public String getDsfInboxEndpointTransit()
	{
		return getPropertySafe(DSF_INBOX_ENDPOINT_TRANSIT);
	}

	@Override
	public String getDsfInboxLogLocation()
	{
		return getPropertySafe(DSF_INBOX_LOG_LOCATION);
	}

	@Override
	public String getGitHubRepository()
	{
		return getPropertySafe(GITHUB_URL);
	}

	@Override
	public String getGithubBranch()
	{
		return getPropertySafe(GITHUB_BRANCH);
	}

	@Override
	public String getGithubUsername()
	{
		return getPropertySafe(GITHUB_USERNAME);
	}

	@Override
	public String getFileStorageUrl()
	{
		return getPropertySafe(FILE_STORAGE_URL);
	}

	@Override
	public String getFileStorageDatabase()
	{
		return getPropertySafe(FILE_STORAGE_DATABASE);
	}

	@Override
	public String getFileStorageUser()
	{
		return getPropertySafe(FILE_STORAGE_USER);
	}

	@Override
	public String getFileStoragePassword()
	{
		return getPropertySafe(FILE_STORAGE_PASSWORD);
	}

	@Override
	public String getGpasUrl()
	{
		return getPropertySafe(GPAS_URL);
	}

	@Override
	public int getPsnLength()
	{
		return Integer.parseInt(getPropertySafe(GPAS_PSN_LENGTH));
	}

	@Override
	public String getGithubCredentials()
	{
		return getPropertySafe(GITHUB_CREDENTIALS);
	}
}
