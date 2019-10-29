package edu.fiap.aula2.model;

//@Entity
//@Table(name = "licenses")
public class License {
//	@Id
//	@Column(name = "license_id", nullable = false)
	private String licenseId;

//	@Column(name = "organization_id", nullable = false)
	private String organizationId;

//	@Column(name = "product_name", nullable = false)
	private String productName;

//	@Column(name = "license_type", nullable = false)
	private String licenseType;

//	@Column(name = "license_max", nullable = false)
	private Integer licenseMax;

//	@Column(name = "license_allocated", nullable = false)
	private Integer licenseAllocated;

//	@Column(name = "comment")
	private String comment;

	public Integer getLicenseMax() {
		return licenseMax;
	}

	public void setLicenseMax(Integer licenseMax) {
		this.licenseMax = licenseMax;
	}

	public Integer getLicenseAllocated() {
		return licenseAllocated;
	}

	public void setLicenseAllocated(Integer licenseAllocated) {
		this.licenseAllocated = licenseAllocated;
	}

	public String getLicenseId() {
		return licenseId;
	}

	public void setLicenseId(String licenseId) {
		this.licenseId = licenseId;
	}

	public String getOrganizationId() {
		return organizationId;
	}

	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getLicenseType() {
		return licenseType;
	}

	public void setLicenseType(String licenseType) {
		this.licenseType = licenseType;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public License withId(String id) {
		setLicenseId(id);
		return this;
	}

	public License withOrganizationId(String organizationId) {
		setOrganizationId(organizationId);
		return this;
	}

	public License withProductName(String productName) {
		setProductName(productName);
		return this;
	}

	public License withLicenseType(String licenseType) {
		setLicenseType(licenseType);
		return this;
	}

	public License withLicenseMax(Integer licenseMax) {
		setLicenseMax(licenseMax);
		return this;
	}

	public License withLicenseAllocated(Integer licenseAllocated) {
		setLicenseAllocated(licenseAllocated);
		return this;
	}

	public License withComment(String comment) {
		setComment(comment);
		return this;
	}

}
