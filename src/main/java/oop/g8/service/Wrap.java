package oop.g8.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import oop.g8.repository.entity.CountryRepository;
import oop.g8.repository.entity.EntityRepository;
import oop.g8.repository.entity.EventRepository;
import oop.g8.repository.entity.LocationRepository;
import oop.g8.repository.entity.OrganizationRepository;
import oop.g8.repository.entity.PersonRepository;
import oop.g8.repository.entity.TimeRepository;
import oop.g8.repository.relation.RelationshipRepository;

@Component
@Service
public class Wrap {

	@Autowired
	public EntityRepository entity_repository;
	@Autowired
	public PersonRepository person_repository;
	@Autowired
	public OrganizationRepository organization_repository;
	@Autowired
	public LocationRepository location_repository;
	@Autowired
	public CountryRepository country_repository;
	@Autowired
	public EventRepository event_repository;
	@Autowired
	public TimeRepository time_repository;
	@SuppressWarnings("rawtypes")
	@Autowired
	public RelationshipRepository relationship_repository;
}
