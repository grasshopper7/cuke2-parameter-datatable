package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import cucumber.deps.com.thoughtworks.xstream.annotations.XStreamConverter;
import cucumber.deps.com.thoughtworks.xstream.annotations.XStreamConverters;
import transformer.RoomsXStreamConverter;
import transformer.TopicXStreamConverter;

//Global registration
@XStreamConverters({
	
	@XStreamConverter(value=RoomsXStreamConverter.class),
	@XStreamConverter(value=TopicXStreamConverter.class)
	})

@RunWith(Cucumber.class)
@CucumberOptions(glue= {"stepdef"},
				features= {"src/test/resources/features/datatable.feature"})
public class DataTableRunner {

}
