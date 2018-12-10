package stepdef;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cucumber.api.Transpose;
import cucumber.api.java.en.Given;
import dataobject.Address;
import dataobject.Lecture;
import dataobject.LectureId;
import dataobject.LectureLite;
import dataobject.LecturePrimitive;
import dataobject.LecturePrimitiveEnum;
import dataobject.LectureSimple;
import dataobject.Lectures;
import dataobject.ProfLevels;
import dataobject.Professor;
import dataobject.Topic;

public class DataTableStepDefinition {

	@Given("^the list string lecture details are$")
	public void theStringLectureDetailsAre(List<List<String>> lectures) {
		System.out.println("");
		System.out.println(lectures);
	}
	
	@Given("^the list primitive lecture details are$")
	public void thePrimitiveLectureDetailsAre(List<LecturePrimitive> lectures) {
		System.out.println("");
		System.out.println(lectures);
	}
	
	@Given("^the list primitive enum lecture details are$")
	public void thePrimitiveEnumLectureDetailsAre(List<LecturePrimitiveEnum> lectures) {
		System.out.println("");
		System.out.println(lectures);
	}
	
	@Given("the list simple lecture object details are")
	public void theSimpleLectureObjectDetailsAre(List<LectureSimple> lectures) {
		System.out.println("");
		System.out.println(lectures);
	}
	
	@Given("^the lecture details are$")
	public void theLectureDetailsAre(List<Lecture> lectures) {
		System.out.println("");
		System.out.println(lectures);
	}

	@Given("^switch the lecture details are$")
	public void switchTheLectureDetailsAre(@Transpose List<Lecture> lectures) {
		System.out.println("");
		System.out.println(lectures);
	}

	@Given("the list no header lecture details are")
	public void theListNoHeaderLectureDetailsAre(List<List<String>> lectstrs) {
		List<LectureLite> lectlite = new ArrayList<>();
		for(List<String> row : lectstrs)
			lectlite.add(LectureLite.createLectureLite(row));
		System.out.println("");
		System.out.println(lectlite);
	}
	
	@Given("^the map primitive key value$")
	public void theMapPrimitiveKeyValue(Map<String,String> profs) {
		System.out.println("");
		System.out.println(profs);
	}

	@Given("^the map object key value$")
	public void theMapObjectKeyValue(Map<Professor,ProfLevels> profs) {
		System.out.println("");
		System.out.println(profs);
	}
	
	@Given("^the map primitive key lecture details are$")
	public void theMapPrimitiveKey(List<List<String>> lectstrs) {
		Map<String, Lecture> lects = new HashMap<>();
		for(List<String> row : lectstrs)
			lects.put(row.get(0), Lecture.createLecture(row.subList(1, row.size())));
		System.out.println("");
		System.out.println(lects);
	}

	@Given("^the map lecture details are$")
	public void theMapLectureDetailsAre(List<List<String>> lectstrs) {
		System.out.println("");
		System.out.println(mapIdLecture(lectstrs));
	}	
	
	@Given("^switch the map lecture details are$")
	public void switchTheMapLectureDetailsAre(@Transpose List<List<String>> lectstrs) {
		System.out.println("");
		System.out.println(mapIdLecture(lectstrs));
	}
	
	@Given("^all lectures details$")
	public void allLecturesDetails(List<List<String>> lectstrs) {
		Lectures lectures = new Lectures();
		for(List<String> row : lectstrs)
			lectures.addLecture(Lecture.createLecture(row));
		System.out.println("");
		System.out.println(lectures);
	}
	
	private Map<LectureId, Lecture> mapIdLecture(List<List<String>> lectstrs) {
		Map<LectureId, Lecture> lects = new HashMap<>();
		for(List<String> row : lectstrs)
			lects.put(new LectureId(Integer.parseInt(row.get(0))), Lecture.createLecture(row.subList(1, row.size())));
		return lects;
	}
}