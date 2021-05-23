package HRMSBackend.HRMS.Core.Utilities.Results;

public class Result {
	private boolean success;
	private String message;

	public Result(boolean success) {
		super();
		this.success = success;
	}

	public Result(String message) {
		super();
		this.message = message;
	}
	public Result(boolean success, String message) {
		this(success);
		this.message = message;
	}

	public boolean isSuccess() {
		return this.success;
	}

	public String getMessage() {
		return this.message;
	}
}