#!/usr/local/bin/ruby

# run ../jruby/bin/jruby logic.rb >logic.ast
# Assignment example
x=true
f = Proc{|x,y,z,w|  c=x+y; c}
d=f.call(3,4,5,true)
e = f.call(false,true,false,true)
g = f[true,true,true,true]
