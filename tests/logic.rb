#!/usr/local/bin/ruby

# run ../jruby/bin/jruby logic.rb >logic.ast
# Assignment example

a=3
a = true

b = false

c = a || b

d = a && b

e = !a

f = !b

g = (a || b) || c

h = (a || b) && c

i = a || (b && c)

l = x && y 

k = w || u


m = !z

e = !a

#r = x && y  # causes error because x and y already used
# r =x         #  ditto
o || p

a=5           # illegal -- sets POLY

f = !b        # ok
m = !z        # not ok

=begin 

f : BOOL
g : BOOL
d : BOOL
e : BOOL
b : BOOL
c : BOOL
a : POLY
o : BOOL
l : BOOL
m : BOOL
k : BOOL
h : BOOL
i : BOOL
w : BOOL
u : BOOL
p : BOOL
z : BOOL
y : BOOL
x : BOOL

=end
