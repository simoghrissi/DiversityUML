package mvc.model;

public class ClassCode implements Expression {

	private ClassDraw workingOnClass;

	public ClassCode(ClassDraw theClass) {
		workingOnClass = theClass;
	}

	@Override
	public String JavaCode() {
		String result = "";
		result += Declaration.visibilityString(workingOnClass.getVisibility());
		switch (workingOnClass.getStereotype()) {
		case ClassDraw.NO_ABSTRACT_NO_INTERFACE_STEREOTYPE:
			result += " class";
			break;
		case ClassDraw.ABSTRACT_STEREOTYPE:
			result += " abstract class";
			break;
		case ClassDraw.INTERFACE_STEREOTYPE:
			result += " interface";
			break;
		default:
			break;
		}
		result += " " + workingOnClass.getName();
		return result;
	}

	@Override
	public String cppCode() {
		String result = "";
		result += Declaration.visibilityString(workingOnClass.getVisibility());
		result += " class";
		result += " " + workingOnClass.getName();
		return result;
	}

}
