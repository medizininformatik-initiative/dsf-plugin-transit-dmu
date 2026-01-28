package de.fraunhofer.isst.health.transit.variables;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.camunda.bpm.engine.impl.variable.serializer.PrimitiveValueSerializer;
import org.camunda.bpm.engine.impl.variable.serializer.ValueFields;
import org.camunda.bpm.engine.variable.impl.value.UntypedValueImpl;
import org.springframework.beans.factory.InitializingBean;

import java.io.IOException;
import java.util.Objects;

public class TasksSerializer extends PrimitiveValueSerializer<TasksValues.TasksValue>
		implements InitializingBean
{
	private final ObjectMapper objectMapper;

	public TasksSerializer(ObjectMapper objectMapper)
	{
		super(TasksValues.VALUE_TYPE);

		this.objectMapper = objectMapper;
	}

	@Override
	public void afterPropertiesSet() throws Exception
	{
		Objects.requireNonNull(objectMapper, "objectMapper");
	}

	@Override
	public void writeValue(TasksValues.TasksValue value, ValueFields valueFields)
	{
		Tasks tasks = value.getValue();
		try
		{
			if (tasks != null)
				valueFields.setByteArrayValue(objectMapper.writeValueAsBytes(tasks));
		}
		catch (JsonProcessingException exception)
		{
			throw new RuntimeException(exception);
		}
	}

	@Override
	public TasksValues.TasksValue convertToTypedValue(UntypedValueImpl untypedValue)
	{
		return TasksValues.create((Tasks) untypedValue.getValue());
	}

	@Override
	public TasksValues.TasksValue readValue(ValueFields valueFields, boolean asTransientValue)
	{
		byte[] bytes = valueFields.getByteArrayValue();

		try
		{
			Tasks Tasks = (bytes == null || bytes.length <= 0) ? null
					: objectMapper.readValue(bytes, Tasks.class);
			return TasksValues.create(Tasks);
		}
		catch (IOException exception)
		{
			throw new RuntimeException(exception);
		}
	}
}
