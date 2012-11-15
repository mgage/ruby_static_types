#!/usr/local/bin/ruby

# run ../jruby/bin/jruby assignment.rb >assignment.ast
# Assignment example
a = 5

b = true


x = y
z = x
y =1

c = a  # c and a become POLY but not b ??
c = b   

i = 5  
j = true

d = j  # d and j become POLY but not i ??
d = i
######################

=begin

d : POLY
b : BOOL
c : POLY
a : POLY
j : POLY
z : INT
y : INT
i : INT
x : INT

=end
