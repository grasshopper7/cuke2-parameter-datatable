Feature: DataTable Conversion for Cucumber-JVM 2
    
  Scenario: List of primitive List<List<String>>
    Given the list string lecture details are
      | Jane | 40 | Assistant |
      | Doe  | 30 | Associate |

  Scenario: List of object containing primitive fields List<LecturePrimitive>
    Given the list primitive lecture details are
      | profName | size | profLevel |
      | Jane     |   40 | Assistant |
      | Doe      |   30 | Associate |

  Scenario: List of object containing primitive & enum fields List<LecturePrimitiveEnum>
    Given the list primitive enum lecture details are
      | profName | size | profLevel |
      | Jane     |   40 | Assistant |
      | Doe      |   30 | Associate |

  Scenario: List of object containing object fields List<Lecture>
    Given the lecture details are
      | profName | topic         | size | frequency | rooms     |
      | Jack     | A1:Topic One  |   40 |         3 | 101A,302C |
      | Daniels  | B5:Topic Five |   30 |         2 | 220E,419D |

  Scenario: Transpose List of object containing object fields List<Lecture>
    Given switch the lecture details are
      | profName  | Jack         | Daniels       |
      | topic     | A1:Topic One | B5:Topic Five |
      | size      |           40 |            30 |
      | frequency |            3 |             2 |
      | rooms     | 101A,302C    | 220E,419D     |

  Scenario: List of object containing object fields with no table header List<LectureLite>
    Given the list no header lecture details are
      | John Doe | A1:Topic One  | 40 | 3 | 101A,302C |
      | Jane Doe | B5:Topic Five | 30 | 2 | 220E,419D |

  Scenario: Map of primitive key and value Map<String,String>
    Given the map primitive key value
      | Jane | Assistant |
      | John | Associate |

  Scenario: Map of object key and enum value Map<Professor,ProfLevels>
    Given the map object key value
      | Jane | Assistant |
      | John | Associate |

  Scenario: Map of primitive key and object value Map<String, Lecture>
    Given the map primitive key lecture details are
      | 1 | John Doe | A1:Topic One  | 40 | 3 | 101A,302C |
      | 2 | Jane Doe | B5:Topic Five | 30 | 2 | 220E,419D |

  Scenario: Map of object key and value Map<Lectureid, Lecture>
    Given the map lecture details are
      | 1 | John Doe | A1:Topic One  | 40 | 3 | 101A,302C |
      | 2 | Jane Doe | B5:Topic Five | 30 | 2 | 220E,419D |

  Scenario: Transpose Map of object key and value Map<Lectureid, Lecture>
    Given switch the map lecture details are
      |            1 |             2 |
      | John Doe     | Jane Doe      |
      | A1:Topic One | B5:Topic Five |
      |           40 |            30 |
      |            3 |             2 |
      | 101A,302C    | 220E,419D     |

  Scenario: Whole table to single object Lectures
    Given all lectures details
      | John     | A1:Topic One   |   40 |         3 | 101A,302C |
      | Jane     | Z9:Topic Six   |   30 |         2 | 220E,419D |
      | Patrick  | E5:Topic Two   |   60 |         1 | 901B,732C |
      | Melrose  | M6:Topic Seven |   20 |         2 | 444E,909A |
