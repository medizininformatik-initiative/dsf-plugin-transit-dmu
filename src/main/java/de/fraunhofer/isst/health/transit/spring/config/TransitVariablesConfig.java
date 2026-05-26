package de.fraunhofer.isst.health.transit.spring.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import de.fraunhofer.isst.health.transit.variables.ResearchersSerializer;
import de.fraunhofer.isst.health.transit.variables.TasksSerializer;
import dev.dsf.bpe.v1.documentation.ProcessDocumentation;
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

	@ProcessDocumentation(required = true, processNames = {
			"datamanagementuniteu_transit" }, description = "The base address of the DMS ProjectFile FHIR server " +
			"to read/store FHIR resources", example = "http://foo.bar/fhir")
	@Value("${eu.datamanagementunit.transit.projectfile.fhir.server.base.url:#{null}}")
	private String projectFileUrl;

	@ProcessDocumentation(required = true, processNames = {
			"datamanagementuniteu_transit" }, description = "The length of the pseudonym", example = "5")
	@Value("${eu.datamanagementunit.transit.gpas.psn.length:5}")
	private int gpasPsnLength;

	@ProcessDocumentation(required = true, processNames = {
			"datamanagementuniteu_transit" }, description = "The base address of the Fhir Stores",
			example = "http://foo.bar")
	@Value("${eu.datamanagementunit.store.hostname:#{null}}")
	private String storeHostname;

	@ProcessDocumentation(required = true, processNames = {
			"datamanagementuniteu_transit" }, description = "The base address of the Git Repository",
			example = "http://foo.bar.git")
	@Value("${eu.datamanagementunit.store.git.url:#{null}}")
	private String gitUrl;

	@ProcessDocumentation(required = true, processNames = {
			"datamanagementuniteu_transit" }, description = "The branch of the git repository",
			example = "main")
	@Value("${eu.datamanagementunit.store.git.branch:#{null}}")
	private String gitBranch;

	@ProcessDocumentation(required = true, processNames = {
			"datamanagementuniteu_transit" }, description = "The user to connecto to the Git Repository",
			example = "max.mustermann")
	@Value("${eu.datamanagementunit.store.git.username:#{null}}")
	private String gitUsername;

	@ProcessDocumentation(required = true, processNames = {
			"datamanagementuniteu_transit" }, description = "The password of the git repository")
	@Value("${eu.datamanagementunit.store.git.credentials:#{null}}")
	private String gitCredentials;

	@ProcessDocumentation(required = true, processNames = {
			"datamanagementuniteu_transit" }, description = "The base address of the File Storage", example = "http://foo.bar/fhir")
	@Value("${eu.datamanagementunit.transit.filestorage.postgres.url:#{null}}")
	private String fileStoragePostgresUrl;

	@ProcessDocumentation(required = true, processNames = {
			"datamanagementuniteu_transit" }, description = "The base address of the DMS file storage Postgres server",
			example = "http://foo.bar")
	@Value("${eu.datamanagementunit.transit.filestorage.postgres.database:#{null}}")
	private String fileStoragePostgresDatabase;

	@ProcessDocumentation(required = true, processNames = {
			"datamanagementuniteu_transit" }, description = "The usernmae of the DMS file storage Postgres server",
			example = "max.mustermann")
	@Value("${eu.datamanagementunit.transit.filestorage.postgres.username:#{null}}")
	private String fileStoragePostgresUsername;

	@ProcessDocumentation(required = true, processNames = {
			"datamanagementuniteu_transit" }, description = "The schema of the DMS file storage Postgres server",
			example = "schema")
	@Value("${eu.datamanagementunit.transit.filestorage.postgres.schema:#{null}}")
	private String fileStoragePostgresSchema;

	@ProcessDocumentation(required = true, processNames = {
			"datamanagementuniteu_transit" }, description = "The password of the DMS file storage Postgres server",
			example = "http://foo.bar/fhir")
	@Value("${eu.datamanagementunit.transit.filestorage.postgres.password:#{null}}")
	private String fileStoragePostgresPassword;

	@ProcessDocumentation(required = true, processNames = {
			"datamanagementuniteu_transit" }, description = "The file path of the DMS file storage server",
			example = "/data")
	@Value("${eu.datamanagementunit.transit.filestorage.path:#{null}}")
	private String fileStoragePath;

	@ProcessDocumentation(required = true, processNames = {
			"datamanagementuniteu_transit" }, description = "The base address of the DMS file storage server",
			example = "http://nginx.bar")
	@Value("${eu.datamanagementunit.transit.filestorage.url:#{null}}")
	private String fileStorageUrl;


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
