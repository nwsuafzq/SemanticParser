package cn.nwafulive.zq.util;

/**
 * ������������
 * 
 */
public class VariableNameGenerator {
	
	private static final String VAR_PREFIX = "T"; // ǰ׺
	public static int sequenceId = 0; // ��� T1��T2��T3...
	
	public static String genVariableName() {
		++sequenceId;
		return VAR_PREFIX + sequenceId;
	}

	public void clear() {
		// TODO Auto-generated method stub
		sequenceId = 0;
	}
}