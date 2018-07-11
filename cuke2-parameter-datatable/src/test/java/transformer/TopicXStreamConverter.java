package transformer;

import cucumber.deps.com.thoughtworks.xstream.converters.Converter;
import cucumber.deps.com.thoughtworks.xstream.converters.MarshallingContext;
import cucumber.deps.com.thoughtworks.xstream.converters.UnmarshallingContext;
import cucumber.deps.com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter;
import cucumber.deps.com.thoughtworks.xstream.io.HierarchicalStreamReader;
import cucumber.deps.com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import dataobject.Topic;

public class TopicXStreamConverter /*extends AbstractSingleValueConverter*/ implements Converter {

	@Override
	public boolean canConvert(Class cls) {
		return Topic.class.isAssignableFrom(cls);
	}

	/*@Override
	public Object fromString(String inputName) {		
		String[] topicData = inputName.split(":");
		Topic topic = new Topic();		
		topic.setCode(topicData[0]);
		topic.setName(topicData[1]);
		return topic;
	}*/
	
	public void marshal(Object value, HierarchicalStreamWriter writer, MarshallingContext context) {
        Topic  topic = (Topic) value;
        writer.setValue(topic.toString());
    }

    public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
    	String[] topicData = reader.getValue().split(":");
		Topic topic = new Topic();		
		topic.setCode(topicData[0]);
		topic.setName(topicData[1]);
		return topic;
    }
}
