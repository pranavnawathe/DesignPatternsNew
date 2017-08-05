class Travel
  def travel
    identifyDestination()
    identifyTravelDates()
    if(!isPublicTransport())
      useVehicle
    end
    if(isMealAvailable())
        chooseMeal()
    end
    if(isPublicTransport())
        bookTicket()
    end
    displayTravelDetails()
  end

  def identifyDestination
    raise NotImplementedError.new("Implement this method in a subclass")
  end

  def identifyTravelDates
    raise NotImplementedError.new("Implement this method in a subclass")
  end

  def chooseMeal
    raise NotImplementedError.new("Implement this method in a subclass")
  end

  def useVehicle
    raise NotImplementedError.new("Implement this method in a subclass")
  end

  def bookTicket
    raise NotImplementedError.new("Implement this method in a subclass")
  end

  def displayTravelDetails
    raise NotImplementedError.new("Implement this method in a subclass")
  end

  def isMealAvailable
    true
  end

  def isPublicTransport
    true
  end

end

class BusTravel < Travel
  def identifyDestination
    puts "Enter your Travel destination:"
    @destination = gets
  end

  def identifyTravelDates
    puts "Enter start date:"
    @startDate = gets
    puts "Enter end date:"
    @endDate = gets
  end

  def chooseMeal
  end

  def useVehicle
  end

  def bookTicket
    puts "Do you want to book your bus for #{@destination} beginning on #{@startDate} and ending on  #{@endDate} (Enter Yes/No)"
    if(gets.chomp.eql? "Yes")
        @bookTicket = true
    else
        @bookTicket = false;
    end
  end

  def displayTravelDetails
     if @bookTicket.equal? true
       puts "Your Bus travel has been confirmed. Following are the details:"
       puts "Destintation = #{@destination}"
       puts "Start Date = #{@startDate}"
       puts "End Date = #{@endDate}"
     else
       puts "Transaction Cancelled"
     end
  end

  def isMealAvailable
    true
  end

  def isPublicTransport
    true
  end
end

class AirTravel < Travel
  def identifyDestination
    puts "Enter your Travel destination:"
    @destination = gets
  end

  def identifyTravelDates
    puts "Enter start date:"
    @startDate = gets
    puts "Enter end date:"
    @endDate = gets
  end

  def chooseMeal
    puts "Select your meal choice from the following:"
    puts "1. Asian Vegetarian"
    puts "2. Low Calorie Meal"
    puts "3. Gluten Free Meal"
    puts "4. Vegetarian Oriental Meal"
    puts "Choose any other number if you dont want a meal"
    @mealSelected = true
    mealChoice = gets.chomp
    case mealChoice
      when "1"
        @meal = "Asian Vegetarian"
      when "2"
        @meal = "Low Calorie Meal"
      when "3"
        @meal = "Gluten Free Meal"
      when "4"
        @meal = "Vegetarian Oriental Meal"
      else
        @mealSelected = false
    end

  end

  def useVehicle
  end

  def bookTicket
    puts "Do you want to book your flight for #{@destination} beginning on #{@startDate} and ending on  #{@endDate} (Enter Yes/No)"
    if(gets.chomp.eql? "Yes")
      @bookTicket = true
    else
      @bookTicket = false;
    end
  end

  def displayTravelDetails
    if @bookTicket.eql? true
      puts "Your flight has been confirmed. Following are the details:"
      puts "Destintation = #{@destination}"
      puts "Start Date = #{@startDate}"
      puts "End Date = #{@endDate}"
      if @mealSelected.eql? true
        puts "Meal Selected #{@meal}"
      end
    else
      puts "Transaction Cancelled"
    end
  end

end

class RoadTrip < Travel
  def identifyDestination
    puts "Enter your Travel destination:"
    @destination = gets
  end

  def identifyTravelDates
    puts "Enter start date:"
    @startDate = gets
    puts "Enter end date:"
    @endDate = gets
  end

  def chooseMeal
  end

  def useVehicle
    puts "Do you have your own vehicle?"
    if(gets.chomp.eql? "Yes")
        @hasOwnVehicle = true;
        puts "Enter Your Vehicle Name:"
        @vehicleName = gets
    else
      puts "Do you want to rent a vehicle?"
      if(gets.chomp.eql? "Yes")
          @hasRentedVehicle = true;
          puts "Enter name of Vehicle to be rented:"
          @vehicleName = gets
      end
    end
  end

  def bookTicket
  end

  def displayTravelDetails
    if @hasOwnVehicle.eql?true or @hasRentedVehicle.eql?true
      puts "Your Road Trip has been confirmed. Following are the details:"
      puts "Destintation = #{@destination}"
      puts "Start Date = #{@startDate}"
      puts "End Date = #{@endDate}"
      puts "Vehicle Name = #{@vehicleName}"
    else
      puts "No Vehicle Available for Road Trip"
    end
  end

  def isMealAvailable
    false
  end

  def isPublicTransport
    false
  end

end

puts "Choose one of the following travel modes:"
puts "1. Bus Travel"
puts "2. Air Travel"
puts "3. Road Trip"

choice = gets.chomp

case choice
  when "1"
    busTravel = BusTravel.new
    busTravel.travel
  when "2"
    airTravel = AirTravel.new
    airTravel.travel
  when "3"
    roadTrip = RoadTrip.new
    roadTrip.travel
  else
    puts "Travel Choice Not available"
end
