package org.jruby.cs453;

import org.jruby.ast.Node;
import org.jruby.ast.NodeType;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class VarTypeTable implements IVarTypeTable  {
	
	private Map<String, TypeClass> mVarTypeTable    = new HashMap<String, TypeClass>();
	

	
	public TypeClass get(String var) {
		
		return this.mVarTypeTable.get(var);
	}

	public TypeClass put(String var, TypeClass guestClass) {
	
	
		return mVarTypeTable.put(var, guestClass);
	}

	public TypeClass update(String var, TypeClass guestClass) {
	
	
	
		return mVarTypeTable.put(var, guestClass);
	}
	
	public Boolean containsKey(String var) {
	
		return mVarTypeTable.containsKey(var);
	}
	
	public Set<String> keySet() {
	
		return mVarTypeTable.keySet();
	}


}