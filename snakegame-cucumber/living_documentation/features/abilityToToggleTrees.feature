Feature: Control players ability to toggle trees based on playing time.

As a game administrator, I want players' ability to toggle trees on and off between
games to depend on the amount of playing time they have accumulated, so that players
have an incentive to play for longer.


Scenario: Players with no accumulated playing time can't toggle trees.

Given a player with 0 seconds of playing time
When the player starts a game
Then trees will be switched off
 And the option to switch trees on or off is not available


Scenario: Players with just under 15 minutes accumulated playing time can't toggle trees.

Given a player with 14 minutes 59 seconds of playing time
When the player starts a game
Then trees will be switched off
 And the option to switch trees on or off is not available
 

Scenario: Players with just over 15 minutes of accumulated playing time can toggle trees.

Given a player with 15 minutes 0 seconds of playing time
When the player starts a game
Then trees will be switched off
 And the option to switch trees on or off is available


Scenario: Players with just under an hour of accumulated playing time can toggle trees.

Given a player with 59 minutes 59 seconds of playing time
When the player starts a game
Then trees will be switched off
 And the option to switch trees on or off is available


Scenario: Players with more than an hour of accumulated playing time can't toggle trees.

Given a player with 1 hour of playing time
When the player starts a game
Then trees will be switched on
 And the option to switch trees on or off is not available




# Below, for comparison, we show the same specification as given by the scenarios above,
# using a table that describes all the scenarios, instead of spelling each one out
# individually.  (Obviously, in a real Cucumber specification, we would choose just one
# way to specify this information.)

Scenario Outline: the player's ability to toggle trees depends on accumulated playing time.

Given a player with <playing_time> of playing time
When the player starts a game
Then trees will be switched <trees_on_or_off>
 And the option to switch trees on or off is <toggle_option_available>

Examples:

  | playing_time | trees_on_or_off | toggle_option_available |
  | Unknown	     | off	           | not available           |
  | 00:00:00     | off	           | not available           |
  | 00:14:59	 | off	           | not available           |
  | 00:15:00	 | off	           | available               |
  | 00:59:59	 | off	           | available               |
  | 01:00:00	 | on	           | not available           |    
