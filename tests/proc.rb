#!/usr/local/bin/ruby

# run ../jruby/bin/jruby logic.rb >logic.ast
# Assignment example

f = Proc{|x,y,z,w| c=x+y; 1}
c=f[3]
