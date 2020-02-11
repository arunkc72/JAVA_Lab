# Java I/O
Java I/O (Input and Output) is used to process the input and produce the output.

Java uses the concept of a stream to make I/O operation fast. The java.io package contains all the classes required for input and output operations.
The java.io package contains nearly every class you might ever need to perform input and output (I/O) in Java. All these streams represent an input source and an output destination. The stream in the java.io package supports many data such as primitives, object, localized characters, etc.
### Stream
A stream can be defined as a sequence of data. There are two kinds of Streams −

##### InPutStream:
  The InputStream is used to read data from a source.

#### OutPutStream:
The OutputStream is used for writing data to a destination.
## Java FileWriter Class:
File Writer class inherits from the OutputStreamWriter class. The class is used to write character-oriented data to a file.

This class has several constructors to create required objects. 
### Constructors of FileWriter class

* FileWriter(String file)	: Creates a new file. It gets file name in string.

* FileWriter(File file)	  : Creates a new file. It gets file name in File object.
## Methods of FileWriter class
 Method | Description |
 ------------- | ------------- |
 void write(String text) | It is used to write the string into FileWriter.  |
 void write(char c) | It is used to write the char into FileWriter. |
 void write(char[] c) |	It is used to write char array into FileWriter.|
 void flush() |	It is used to flushes the data of FileWriter.|
 void close()	| It is used to close the FileWriter.|
