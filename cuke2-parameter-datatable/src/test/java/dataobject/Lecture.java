package dataobject;

import java.util.List;

import cucumber.deps.com.thoughtworks.xstream.annotations.XStreamConverter;
import transformer.ProfessorXStreamConverter;
import transformer.RoomsXStreamConverter;
import transformer.TopicXStreamConverter;

public class Lecture {

	//@XStreamConverter(value = ProfessorXStreamConverter.class)
	private Professor profName;
	
	//Variable declaration
	//@XStreamConverter(value = TopicXStreamConverter.class)
	private Topic topic;
	
	private int size;
	
	private int frequency;
	
	//Variable declaration
	//@XStreamConverter(value = RoomsXStreamConverter.class)
	private Rooms rooms;

	
	public Professor getProfName() {
		return profName;
	}

	public void setProfName(Professor profName) {
		this.profName = profName;
	}

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getFrequency() {
		return frequency;
	}

	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}

	public Rooms getRooms() {
		return rooms;
	}

	public void setRooms(Rooms rooms) {
		this.rooms = rooms;
	}
	
	public static Lecture createLecture(List<String> row) {
		Lecture lecture = new Lecture();
		Professor prof = new Professor();
		prof.setProfName(row.get(0));
		lecture.setProfName(prof);
		lecture.setTopic(Topic.parseTopic(row.get(1)));
		lecture.setSize(Integer.parseInt(row.get(2)));
		lecture.setFrequency(Integer.parseInt(row.get(3)));
		lecture.setRooms(Rooms.parseRooms(row.get(4)));
		return lecture;
	}

	@Override
	public String toString() {
		return "Lecture [profName=" + profName + ", topic=" + topic + ", size=" + size + ", frequency=" + frequency
				+ ", rooms=" + rooms + "]";
	}

	
}
