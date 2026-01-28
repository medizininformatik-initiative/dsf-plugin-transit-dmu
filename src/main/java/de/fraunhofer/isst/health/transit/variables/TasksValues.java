package de.fraunhofer.isst.health.transit.variables;

import org.camunda.bpm.engine.variable.impl.type.PrimitiveValueTypeImpl;
import org.camunda.bpm.engine.variable.impl.value.PrimitiveTypeValueImpl;
import org.camunda.bpm.engine.variable.type.PrimitiveValueType;
import org.camunda.bpm.engine.variable.value.PrimitiveValue;
import org.camunda.bpm.engine.variable.value.TypedValue;

import java.util.Map;

public final class TasksValues
{
	public interface TasksValue extends PrimitiveValue<Tasks>
	{
	}

	private static class TasksValueImpl extends PrimitiveTypeValueImpl<Tasks> implements TasksValue
	{
		private static final long serialVersionUID = 1L;

		public TasksValueImpl(Tasks value, PrimitiveValueType type)
		{
			super(value, type);
		}
	}

	public static class TasksValueTypeImpl extends PrimitiveValueTypeImpl
	{
		private static final long serialVersionUID = 1L;

		private TasksValueTypeImpl()
		{
			super(Tasks.class);
		}

		@Override
		public TypedValue createValue(Object value, Map<String, Object> valueInfo)
		{
			return new TasksValueImpl((Tasks) value, VALUE_TYPE);
		}
	}

	public static final PrimitiveValueType VALUE_TYPE = new TasksValueTypeImpl();

	private TasksValues()
	{
	}

	public static TasksValue create(Tasks value)
	{
		return new TasksValueImpl(value, VALUE_TYPE);
	}
}
