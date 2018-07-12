[Parameter.feature](https://github.com/grasshopper7/cuke2-parameter-datatable/blob/master/cuke2-parameter-datatable/src/test/resources/features/parameter.feature) & [ParameterStepDefinition](https://github.com/grasshopper7/cuke2-parameter-datatable/blob/master/cuke2-parameter-datatable/src/test/java/stepdef/ParameterStepDefinition.java)

[Scenario](https://github.com/grasshopper7/cuke2-parameter-datatable/blob/master/cuke2-parameter-datatable/src/test/resources/features/parameter.feature#L3): Delimiter annotation scenario

[Step](https://github.com/grasshopper7/cuke2-parameter-datatable/blob/master/cuke2-parameter-datatable/src/test/java/stepdef/ParameterStepDefinition.javaL#20): the user names are jane,john,colin,alice --> Convert to List<String>.

[Step](https://github.com/grasshopper7/cuke2-parameter-datatable/blob/master/cuke2-parameter-datatable/src/test/java/stepdef/ParameterStepDefinition.javaL#26): the users are jane,john,colin,alice	--> Convert to List< dataobject.User>. User has a single argument constructor.
	
[Scenario](https://github.com/grasshopper7/cuke2-parameter-datatable/blob/master/cuke2-parameter-datatable/src/test/resources/features/parameter.feature#L8): Format annotation scenario	

[Step](https://github.com/grasshopper7/cuke2-parameter-datatable/blob/master/cuke2-parameter-datatable/src/test/java/stepdef/ParameterStepDefinition.javaL#32): the date is 2017-11-05T09:54:13	--> Convert to java.util.Date.
	
[Scenario](https://github.com/grasshopper7/cuke2-parameter-datatable/blob/master/cuke2-parameter-datatable/src/test/resources/features/parameter.feature#L14): Transformer annotation scenario

[Step](https://github.com/grasshopper7/cuke2-parameter-datatable/blob/master/cuke2-parameter-datatable/src/test/java/stepdef/ParameterStepDefinition.javaL#38): the name is 'John Mich Arthur Doe' --> Convert to custom dataobject.FullName. FullName does NOT have a single argument constructor.

[Step](https://github.com/grasshopper7/cuke2-parameter-datatable/blob/master/cuke2-parameter-datatable/src/test/java/stepdef/ParameterStepDefinition.javaL#44): the amount is $91.63 --> Convert to custom dataobject.Money. Money does NOT have a single argument constructor.
	
[Scenario](https://github.com/grasshopper7/cuke2-parameter-datatable/blob/master/cuke2-parameter-datatable/src/test/resources/features/parameter.feature#L20): Single argument constructor scenario	

[Step](https://github.com/grasshopper7/cuke2-parameter-datatable/blob/master/cuke2-parameter-datatable/src/test/java/stepdef/ParameterStepDefinition.javaL#50): the user name is John Doe --> Convert to custom dataobject.User. 
	
[Scenario](https://github.com/grasshopper7/cuke2-parameter-datatable/blob/master/cuke2-parameter-datatable/src/test/resources/features/parameter.feature#L26): NO single argument constructor scenario

[Step](https://github.com/grasshopper7/cuke2-parameter-datatable/blob/master/cuke2-parameter-datatable/src/test/java/stepdef/ParameterStepDefinition.javaL#56): the professor is John Doe --> Convert to custom dataobject.Professor. Professor does NOT have a single argument constructor.
	
[Scenario](https://github.com/grasshopper7/cuke2-parameter-datatable/blob/master/cuke2-parameter-datatable/src/test/resources/features/parameter.feature#L34): Enum scenario

[Step](https://github.com/grasshopper7/cuke2-parameter-datatable/blob/master/cuke2-parameter-datatable/src/test/java/stepdef/ParameterStepDefinition.javaL#62): the professor level is ASSOCIATE --> Convert to custom dataobject.ProfLevels enum.

-------------------------------------------------------------------

[Datatable.feature](https://github.com/grasshopper7/cuke2-parameter-datatable/blob/master/cuke2-parameter-datatable/src/test/resources/features/datatable.feature) & [DataTableStepDefinition](https://github.com/grasshopper7/cuke2-parameter-datatable/blob/master/cuke2-parameter-datatable/src/test/java/stepdef/DataTableStepDefinition.java)

Scenario: List of primitive	--> Convert to List<List<String>>.
	
Scenario: List of object containing primitive fields --> Convert to List<LecturePrimitive>.
	
Scenario: List of object containing primitive & enum fields	--> Convert to List<LecturePrimitiveEnum>.
	
Scenario: List of object containing object fields	--> Convert to List<Lecture>.
	
Scenario: Transpose List of object containing object fields --> Convert to List<Lecture> with Transpose annotation.
	
Scenario: List of object containing object fields with no table header --> Convert to List<LectureLite>.
	
Scenario: Map of primitive key and value --> Convert to Map<String,String>.
	
Scenario: Map of object key and enum value --> Convert to Map<Professor,ProfLevels>.
	
Scenario: Map of primitive key and object value	--> Convert to Map<String, Lecture>.
	
Scenario: Map of object key and value	--> Convert to Map<Lectureid, Lecture>.
	
Scenario: Transpose Map of object key and value	--> Convert to Map<Lectureid, Lecture> with Transpose annotation.
	
Scenario: Whole table to single object Lectures	--> Convert to object Lectures.

