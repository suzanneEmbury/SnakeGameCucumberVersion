Feature: Only perpendicular changes of snake direction are allowed.

As a game site owner, I want players to be able to change the snake's direction
at any point in an active game, so that Snake Game becomes a game of skill.


Scenario Outline: only perpendicular changes of direction are allowed.

Given a snake game in play
  And the snake is facing <current_direction>
  And the player requests a change of direction to <requested_direction>
When  the next game tick passes
Then  the snake's direction will become <new_direction>

Examples:

  | current_direction | requested_direction | new_direction |
  | North             | North               | North         |
  | North             | East                | East          |
  | North             | South               | North         |
  | North             | West                | West          |
  | East              | North               | North         |
  | East              | East                | East          |
  | East              | South               | South         |
  | East              | West                | East          |
  | South             | North               | South         |
  | South             | East                | East          |
  | South             | South               | South         |
  | South             | West                | West          |
  | West              | North               | North         |
  | West              | East                | West          |
  | West              | South               | South         |
  | West              | West                | West         |
