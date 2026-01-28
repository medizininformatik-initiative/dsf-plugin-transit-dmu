package de.fraunhofer.isst.health.transit.variables;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Tasks
{
	private final List<String> entries = new ArrayList<>();

	@JsonCreator
	public Tasks(@JsonProperty("entries") Collection<String> tasks)
	{
		if (tasks != null)
			this.entries.addAll(tasks);
	}

	@JsonProperty("entries")
	public List<String> getEntries()
	{
		return Collections.unmodifiableList(entries);
	}

	@JsonIgnore
	public boolean isEmpty()
	{
		return entries.isEmpty();
	}
}
