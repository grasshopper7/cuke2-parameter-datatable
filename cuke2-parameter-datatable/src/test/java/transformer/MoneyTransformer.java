package transformer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import cucumber.api.Transformer;
import dataobject.Money;

public class MoneyTransformer extends Transformer<Money> {

	@Override
	public Money transform(String value) {
		Matcher matcher = Pattern.compile("^([\\D]*)([\\d]+)\\.([\\d][\\d])$").matcher(value);
		matcher.find();		
		return new Money(matcher.group(1), Integer.parseInt(matcher.group(2)),
				Integer.parseInt(matcher.group(3)));
	}

}
