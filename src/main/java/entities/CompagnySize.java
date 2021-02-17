package entities;

public enum CompagnySize {
	EMP_0_4 ("0-4 employees"),
	EMP_5_50 ("5-50 employees"),
	EMP_51_350 ("51-350 employees"),
	EMP_351_1000 ("351-1,000 employees"),
	EMP_1001_3000 ("1,001-3,000 employees"),
	EMP_3001_5000 ("3,001-5,000 employees"),
	EMP_SUP_5000 (">5,000 employees");
	
	private final String value;
	
	private CompagnySize(final String value) {
        this.value = value;
    }
	public String getValue() { return value; }
}
