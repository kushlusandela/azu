import java.util.*;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 *
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;

	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		return this.students=students;

	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		try{
		if(students==null)
    throw new IllegalArgumentException("IllegalArgumentException occured");

		}
 catch(Exception e){
    throw new IllegalArgumentException("IllegalArgumentException error");
 }
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		try{
		    int stulen=students.length;
		if((index<0)||(index>=stulen)){
    throw new IllegalArgumentException("IllegalArgumentException occured");
		}

		}
	catch(Exception e){
    throw new IllegalArgumentException("IllegalArgumentException error");

 }

return students[index];
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		try{
		    int stulen=students.length;
		if((index<0)||(index>=stulen)){
    throw new IllegalArgumentException("IllegalArgumentException occured");
		}
else{
    students[index]=student;
}
		}
	catch(Exception e){
    throw new IllegalArgumentException("IllegalArgumentException error");

 }


	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		try{
		if(student==null)
    throw new IllegalArgumentException("IllegalArgumentException occured");
    else{
            //arrange it
        students[0]=student;
    }

		}
 catch(Exception e){
    throw new IllegalArgumentException("IllegalArgumentException error");
 }

	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		try{
        int stulen=students.length;
		if(student==null)
    throw new IllegalArgumentException("IllegalArgumentException occured");
    else{
stulen=stulen-1;
students[stulen]=student;

    }

		}
 catch(Exception e){
    throw new IllegalArgumentException("IllegalArgumentException error");
 }
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		try{
		    int stulen=students.length;
		if((index<0)||(index>=stulen)){
    throw new IllegalArgumentException("IllegalArgumentException occured");
		}
else{
    students[index]=student;
}
		}
	catch(Exception e){
    throw new IllegalArgumentException("IllegalArgumentException error");

 }

	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		try{
		    int stulen=students.length;
		if((index<0)||(index>=stulen)){
    throw new IllegalArgumentException("IllegalArgumentException occured");
		}
else{
    students[index]=null;
}
		}
	catch(Exception e){
    throw new IllegalArgumentException("IllegalArgumentException error");

 }

	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		try{
		      int stulen=students.length;
		if(students==null)
    throw new IllegalArgumentException("IllegalArgumentException occured");
else{
    for(int i=0;i>stulen;i++)
    {
        if(student.equals(students[i]))
        {
            students[i]=null;
            System.out.println("Student not exist");
        }
        else{
             throw new IllegalArgumentException("IllegalArgumentException error");

        }
    }
}
		}
 catch(Exception e){
    throw new IllegalArgumentException("IllegalArgumentException error");
 }
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
