import java.util.HashMap;
import java.util.Map;

public class STC extends Object
{
	private Map<String, Object> data;
	private Token identifier;
	private DataType kind;
	private String scope;
	private String type;


	public STC(Token identifier, String scope, DataType kind) 
	{
		this.identifier = identifier;
		this.scope = scope;
		this.data = new HashMap<String, Object>();
		this.kind = kind;
	}

	public STC(Token identifier, String type, String scope, DataType kind) 
	{
		this.identifier = identifier;
		this.type = type;
		this.scope = scope;
		this.data = new HashMap<String, Object>();
		this.kind = kind;
	}

	void addData(String key, Object obj) 
	{
		data.put(key, obj);
	}

	Object getData(String key) 
	{
		return data.get(key);
	}

	Map getData()
	{
		return data;
	}

	Token getIdentifier() 
	{
		return identifier;
	}

	void setIdentifier(Token identifier) 
	{
		this.identifier = identifier;
	}

	DataType getKind() 
	{
		return kind;
	}

	String getScope() 
	{
		return scope;
	}

	void setScope(String scope) 
	{
		this.scope = scope;
	}

	String getType() 
	{
		return type;
	}

	void setType(String type) 
	{
		this.type = type;
	}

	@Override
	public String toString() 
	{
		return type + " " + identifier + " " + scope + " " + data;
	}
}

