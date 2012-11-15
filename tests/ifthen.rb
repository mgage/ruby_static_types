#!/usr/local/bin/ruby

# run ../jruby/bin/jruby ifthen.rb >ifthen.ast
# ifthen example

a = 3;

b = 4;

t = true;
f =false;

z = if (true) then
	c = a;
else 
	d = 5;
end

# these examples should raise an exception 
# at the moment they don't work at all

# y = if (true) then
# 	c = 3;
# else 
# 	d = false;
# end
# 
# x = if (true) then
# 	c = f;
# else 
# 	d = a;
# end



