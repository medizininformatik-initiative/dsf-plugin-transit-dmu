package de.fraunhofer.isst.health.transit.spring.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import de.fraunhofer.isst.health.transit.variables.ResearchersSerializer;
import de.fraunhofer.isst.health.transit.variables.TasksSerializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "de.fraunhofer.isst.health.transit")
public class TransitVariablesConfig
{

	@Autowired
	private ObjectMapper objectMapper;

	@Bean
	public ResearchersSerializer researchersSerializer()
	{
		return new ResearchersSerializer(objectMapper);
	}

	@Bean
	public TasksSerializer tasksSerializer()
	{
		return new TasksSerializer(objectMapper);
	}

	@Value("${eu.datamanagementunit.transit.projectfile.fhir.server.base.url:#{null}}")
	private String projectFileUrl;

	@Value("${eu.datamanagementunit.transit.gpas.psn.length:5}")
	private int gpasPsnLength;

	@Value("${eu.datamanagementunit.store.hostname:#{null}}")
	private String storeHostname;

	@Value("${eu.datamanagementunit.store.git.url:#{null}}")
	private String gitUrl;

	@Value("${eu.datamanagementunit.store.git.branch:#{null}}")
	private String gitBranch;

	@Value("${eu.datamanagementunit.store.git.username:#{null}}")
	private String gitUsername;

	@Value("${eu.datamanagementunit.store.git.credentials:#{null}}")
	private String gitCredentials;


	public String getStoreHostname()
	{
		return storeHostname;
	}

	public String getGitBranch()
	{
		return gitBranch;
	}

	public String getGitUrl()
	{
		return gitUrl;
	}

	public String getGitUsername()
	{
		return gitUsername;
	}

	public String getGitCredentials()
	{
		return gitCredentials;
	}

	public int getGpasPsnLength()
	{
		return gpasPsnLength;
	}

	public String getProjectFileUrl()
	{
		return projectFileUrl;
	}

	@Value("${eu.datamanagementunit.transit.filestorage.postgres.url:#{null}}")
	private String fileStoragePostgresUrl;

	@Value("${eu.datamanagementunit.transit.filestorage.postgres.database:#{null}}")
	private String fileStoragePostgresDatabase;

	@Value("${eu.datamanagementunit.transit.filestorage.postgres.username:#{null}}")
	private String fileStoragePostgresUsername;

	@Value("${eu.datamanagementunit.transit.filestorage.postgres.schema:#{null}}")
	private String fileStoragePostgresSchema;

	@Value("${eu.datamanagementunit.transit.filestorage.postgres.password:#{null}}")
	private String fileStoragePostgresPassword;

	@Value("${eu.datamanagementunit.transit.filestorage.path:#{null}}")
	private String fileStoragePath;

	@Value("${eu.datamanagementunit.transit.filestorage.url:#{null}}")
	private String fileStorageUrl;

	public ObjectMapper getObjectMapper()
	{
		return objectMapper;
	}

	public String getFileStoragePostgresUrl()
	{
		return fileStoragePostgresUrl;
	}

	public String getFileStoragePostgresDatabase()
	{
		return fileStoragePostgresDatabase;
	}

	public String getFileStoragePostgresUsername()
	{
		return fileStoragePostgresUsername;
	}

	public String getFileStoragePostgresSchema()
	{
		return fileStoragePostgresSchema;
	}

	public String getFileStoragePostgresPassword()
	{
		return fileStoragePostgresPassword;
	}

	public String getFileStoragePath()
	{
		return fileStoragePath;
	}

	public String getFileStorageUrl()
	{
		return fileStorageUrl;
	}
}
