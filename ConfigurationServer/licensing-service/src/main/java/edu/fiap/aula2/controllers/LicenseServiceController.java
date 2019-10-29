package edu.fiap.aula2.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import edu.fiap.aula2.config.ServiceConfig;
import edu.fiap.aula2.model.License;
import edu.fiap.aula2.services.LicenseService;

@RestController
@RequestMapping(value = "v1/organizations/{organizationId}/licenses")
public class LicenseServiceController {

	@Autowired
	private LicenseService licenseService;

	@Autowired
	private ServiceConfig serviceConfig;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<License> getLicenses(@PathVariable("organizationId") String organizationId) {
		System.out.println(serviceConfig.getExampleProperty());
		return licenseService.getLicensesByOrg(organizationId);
	}

	@RequestMapping(value = "/{licenseId}", method = RequestMethod.GET)
	public License getLicenses(@PathVariable("organizationId") String organizationId,
			@PathVariable("licenseId") String licenseId) {

		return licenseService.getLicense(organizationId, licenseId);
	}

	@RequestMapping(value = "{licenseId}", method = RequestMethod.PUT)
	public String updateLicenses(@PathVariable("licenseId") String licenseId) {
		return String.format("This is the put");
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public void saveLicenses(@RequestBody License license) {
		licenseService.saveLicense(license);
	}

	@RequestMapping(value = "{licenseId}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public String deleteLicenses(@PathVariable("licenseId") String licenseId) {
		return String.format("This is the Delete");
	}
}
