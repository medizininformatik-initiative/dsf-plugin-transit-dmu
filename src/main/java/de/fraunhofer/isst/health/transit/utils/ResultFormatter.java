package de.fraunhofer.isst.health.transit.utils;

import org.hl7.fhir.r4.model.OperationOutcome;

import java.util.ArrayList;
import java.util.List;

public final class ResultFormatter
{

	private ResultFormatter()
	{
	}

	public static List<OperationOutcome.OperationOutcomeIssueComponent> filterForError(List<OperationOutcome> outcomes)
	{
		List<OperationOutcome.OperationOutcomeIssueComponent> problems = new ArrayList<>();
		for (OperationOutcome op : outcomes)
		{
			for (OperationOutcome.OperationOutcomeIssueComponent issueComponent : op.getIssue())
			{
				if (issueComponent.getSeverity() == OperationOutcome.IssueSeverity.ERROR
						|| issueComponent.getSeverity() == OperationOutcome.IssueSeverity.FATAL)
				{
					problems.add(issueComponent);
				}
			}
		}
		return problems;
	}
}
