package transformer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import cucumber.deps.com.thoughtworks.xstream.converters.Converter;
import cucumber.deps.com.thoughtworks.xstream.converters.MarshallingContext;
import cucumber.deps.com.thoughtworks.xstream.converters.UnmarshallingContext;
import cucumber.deps.com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter;
import cucumber.deps.com.thoughtworks.xstream.io.HierarchicalStreamReader;
import cucumber.deps.com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import dataobject.Professor;
import dataobject.Room;
import dataobject.Rooms;

public class RoomsXStreamConverter /*extends AbstractSingleValueConverter*/ implements Converter {

	@Override
	public boolean canConvert(Class cls) {
		//return cls.equals(Rooms.class);
		return Rooms.class.isAssignableFrom(cls);
	}

	/*@Override
	public Object fromString(String value) {

		List<Room> rooms = Arrays.stream(value.split(",")).map(Room::new).collect(Collectors.toList());
		return new Rooms(rooms);		
	}*/

	public void marshal(Object value, HierarchicalStreamWriter writer, MarshallingContext context) {
        Rooms  rooms = (Rooms) value;
        writer.setValue(rooms.toString());
    }

    public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
    	List<Room> rooms = Arrays.stream(reader.getValue().split(",")).map(Room::new).collect(Collectors.toList());
		return new Rooms(rooms);
    }
}
