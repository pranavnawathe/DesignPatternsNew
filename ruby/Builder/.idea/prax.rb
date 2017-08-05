r= Array.new
r.push(5)
r.push(6)
z= Array.new
z.push(10)

r.push(z)
r.each {|x| puts "#{x}"}