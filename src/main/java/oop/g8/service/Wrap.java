package oop.g8.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import oop.g8.repository.entity.CountryR;
import oop.g8.repository.entity.EventR;
import oop.g8.repository.entity.LocationR;
import oop.g8.repository.entity.OrganizationR;
import oop.g8.repository.entity.PersonR;
import oop.g8.repository.entity.TimeR;
import oop.g8.repository.relation.country.C2CR;
import oop.g8.repository.relation.country.C2ER;
import oop.g8.repository.relation.country.C2LR;
import oop.g8.repository.relation.country.C2OR;
import oop.g8.repository.relation.country.C2PR;
import oop.g8.repository.relation.country.C2TR;
import oop.g8.repository.relation.event.E2CR;
import oop.g8.repository.relation.event.E2ER;
import oop.g8.repository.relation.event.E2LR;
import oop.g8.repository.relation.event.E2OR;
import oop.g8.repository.relation.event.E2PR;
import oop.g8.repository.relation.event.E2TR;
import oop.g8.repository.relation.location.L2CR;
import oop.g8.repository.relation.location.L2ER;
import oop.g8.repository.relation.location.L2LR;
import oop.g8.repository.relation.location.L2OR;
import oop.g8.repository.relation.location.L2PR;
import oop.g8.repository.relation.location.L2TR;
import oop.g8.repository.relation.organization.O2CR;
import oop.g8.repository.relation.organization.O2ER;
import oop.g8.repository.relation.organization.O2LR;
import oop.g8.repository.relation.organization.O2OR;
import oop.g8.repository.relation.organization.O2PR;
import oop.g8.repository.relation.organization.O2TR;
import oop.g8.repository.relation.person.P2CR;
import oop.g8.repository.relation.person.P2ER;
import oop.g8.repository.relation.person.P2LR;
import oop.g8.repository.relation.person.P2OR;
import oop.g8.repository.relation.person.P2PR;
import oop.g8.repository.relation.person.P2TR;
import oop.g8.repository.relation.time.T2CR;
import oop.g8.repository.relation.time.T2ER;
import oop.g8.repository.relation.time.T2LR;
import oop.g8.repository.relation.time.T2OR;
import oop.g8.repository.relation.time.T2PR;
import oop.g8.repository.relation.time.T2TR;

@Component
public class Wrap {

	@Autowired
	public PersonR pr;
	@Autowired
	public OrganizationR or;
	@Autowired
	public LocationR lr;
	@Autowired
	public CountryR cr;
	@Autowired
	public EventR er;

	@Autowired
	public TimeR tr;
	@Autowired
	public P2PR ppr;
	@Autowired
	public P2OR por;
	@Autowired
	public P2LR plr;
	@Autowired
	public P2CR pcr;
	@Autowired
	public P2ER per;
	@Autowired
	public P2TR ptr;

	@Autowired
	public O2PR opr;
	@Autowired
	public O2OR oor;
	@Autowired
	public O2LR olr;
	@Autowired
	public O2CR ocr;
	@Autowired
	public O2ER oer;
	@Autowired
	public O2TR otr;

	@Autowired
	public L2PR lpr;
	@Autowired
	public L2OR lor;
	@Autowired
	public L2LR llr;
	@Autowired
	public L2CR lcr;
	@Autowired
	public L2ER ler;
	@Autowired
	public L2TR ltr;

	@Autowired
	public C2PR cpr;
	@Autowired
	public C2OR cor;
	@Autowired
	public C2LR clr;
	@Autowired
	public C2CR ccr;
	@Autowired
	public C2ER cer;
	@Autowired
	public C2TR ctr;

	@Autowired
	public E2PR epr;
	@Autowired
	public E2OR eor;
	@Autowired
	public E2LR elr;
	@Autowired
	public E2CR ecr;
	@Autowired
	public E2ER eer;
	@Autowired
	public E2TR etr;

	@Autowired
	public T2PR tpr;
	@Autowired
	public T2OR tor;
	@Autowired
	public T2LR tlr;
	@Autowired
	public T2CR tcr;
	@Autowired
	public T2ER ter;
	@Autowired
	public T2TR ttr;

}
