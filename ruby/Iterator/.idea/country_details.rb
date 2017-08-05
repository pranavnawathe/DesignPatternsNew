require 'set'
class Country
  def initialize name, area, population
    @name = name;
    @area = area;
    @population = population;
  end
  def getName
    @name;
  end
  def getArea
    @area;
  end
  def getPopulation
    @population;
  end
end

class CountryArray
  def initialize
    @countryArray = [Country.new("Australia",297,23),Country.new("Germany",14,81), Country.new("France",25,66)]
  end
  def getCountryArray
    @countryArray
  end
end

class CountrySet
  def initialize
    @countrySet = Set[Country.new("India",120,1252),Country.new("United States",380,316), Country.new("China",370,1357)]
  end
  def getCountrySet
    @countrySet
  end
end

class CountryDetails
  def self.displayCounries(group)
    group.each do|country|
      puts "Country Name = #{country.getName} Country Area = #{country.getArea} Country Population = #{country.getPopulation}"
    end
  end
end

countryArray = CountryArray.new.getCountryArray
countrySet = CountrySet.new.getCountrySet

CountryDetails.displayCounries(countryArray)
CountryDetails.displayCounries(countrySet)
