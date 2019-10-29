package edu.fiap.aula2.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.fiap.aula2.config.ServiceConfig;
import edu.fiap.aula2.model.License;

@Service
public class LicenseService {

//	@Autowired
//	private LicenseRepository licenseRepository;

	@Autowired
	ServiceConfig config;

	public License getLicense(String organizationId, String licenseId) {
//		License license = licenseRepository.findByOrganizationIdAndLicenseId(organizationId, licenseId);
//		return license.withComment(config.getExampleProperty());
		return null;
	}

	public List<License> getLicensesByOrg(String organizationId) {
//		return licenseRepository.findByOrganizationId(organizationId);
		return null;
	}

	public void saveLicense(License license) {
		license.withId(UUID.randomUUID().toString());

//		licenseRepository.save(license);

	}

	public void updateLicense(License license) {
//		licenseRepository.save(license);
	}

	public void deleteLicense(License license) {
//		licenseRepository.delete(license.getLicenseId());
	}

}
