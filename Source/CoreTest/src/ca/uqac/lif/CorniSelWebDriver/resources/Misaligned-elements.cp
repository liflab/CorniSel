# We define a predicate using the construct
# "We say that <arguments> is/are <predicate name> when".

We say that $x and $y are left-aligned when (
  $x's left equals $y's left
).

We say that $x and $y are top-aligned when (
  $x's top equals $y's top
).

We say that the page is big when (
  The media query "(min-width: 200px)" applies
).

The following rules apply when (
	the page is big
).

# We then express the fact that all menu items are either
# left- or top-aligned.

"""
  @name Menus aligned
  @description All list items should either be left- or top-aligned.
  @severity Warning
"""
For each $z in $(#topLeft ul li) (
  For each $t in $(#topLeft ul li) (
  	Not(
    	($z and $t are left-aligned)
    	Or
    	($z and $t are top-aligned)
    )
  )
).
