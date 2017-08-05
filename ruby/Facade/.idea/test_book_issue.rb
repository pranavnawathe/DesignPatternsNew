  class StudentAccountCheck
    def initialize
      @studentIdList = [2000,2001,2002,2003,2005,2010]
    end
    def studentIdValid?(sid)
      if @studentIdList.include? sid
        return true
      else
        puts "I am sorry, your ID is invalid"
        return false
      end
    end
  end


  class BookAvailabilityCheck
    @@bookMap = {"Java- The Complete Reference" => 1, "Design of Wood Structures" => 3, "Three Mistakes of My Life" => 7}

    def bookAvailable?(book)
      puts @@bookMap[book]
      if @@bookMap.key? book and (@@bookMap.fetch book) > 0
        @@bookMap[book] = (@@bookMap.fetch book) - 1
        puts @@bookMap[book]
        puts "The Book is available"
        return true
      else
        puts "I am sorry the book is not available"
        return false
      end
    end
  end

  class BookIssueFacade
    def initialize studentId
      @studentId = studentId;
      @acctCheck = StudentAccountCheck.new;
      @bookCheck = BookAvailabilityCheck.new;
    end
    def getStudentId
      @studentId
    end
    def issueBook(book)
      if @acctCheck.studentIdValid? @studentId and @bookCheck.bookAvailable? book
        puts "You have 2 days to return it"
      end
    end
  end

  b1 = BookIssueFacade.new 2001
  b1.issueBook "Java- The Complete Reference"

  b2 = BookIssueFacade.new 2001
  b2.issueBook "Java- The Complete Reference"

