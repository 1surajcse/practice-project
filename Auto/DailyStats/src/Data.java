public class Data {
	private String agentName;

	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public Double getAvgLatency() {
		return avgLatency;
	}

	public void setAvgLatency(Double avgLatency) {
		this.avgLatency = avgLatency;
	}

	public Double getTotalReq() {
		return totalReq;
	}

	public void setTotalReq(Double totalReq) {
		this.totalReq = totalReq;
	}

	public Double getSuccess() {
		return success;
	}

	public void setSuccess(Double success) {
		this.success = success;
	}

	public Double getAgentErrors() {
		return agentErrors;
	}

	public void setAgentErrors(Double agentErrors) {
		this.agentErrors = agentErrors;
	}

	public Integer getSiteErrors() {
		return siteErrors;
	}

	public void setSiteErrors(Integer siteErrors) {
		this.siteErrors = siteErrors;
	}

	public Integer getUarErrors() {
		return uarErrors;
	}

	public void setUarErrors(Integer uarErrors) {
		this.uarErrors = uarErrors;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	private Double avgLatency;
	private Double totalReq;
	private Double success;
	private Double agentErrors;
	private Integer siteErrors;
	private Integer uarErrors;
	private String date;

	public Double getSuccess_percentage() {
		return success_percentage;
	}

	public void setSuccess_percentage(Double success_percentage) {
		this.success_percentage = success_percentage;
	}

	public Double getAgent_error_percentage() {
		return agent_error_percentage;
	}

	public void setAgent_error_percentage(Double agent_error_percentage) {
		this.agent_error_percentage = agent_error_percentage;
	}

	private Double success_percentage;
	private Double agent_error_percentage;

	public Data() {
	}

	public Data(String date, String agentName, Double avgLatency, Double totalReq, Double success, Double agentErrors,
			Integer siteErrors, Integer uarErrors, Double success_per, Double agent_err_per) {
		this.agentErrors = agentErrors;
		this.avgLatency = avgLatency;
		this.agentName = agentName;
		this.avgLatency = avgLatency;
		this.date = date;
		this.success = success;
		this.siteErrors = siteErrors;
		this.uarErrors = uarErrors;
		this.totalReq = totalReq;
		this.success_percentage = success_per;
		this.agent_error_percentage = agent_err_per;

	}

}

