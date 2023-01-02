import cg.t24.Constants

def call(Map config=[:]) {
  if (config.type == "teams") {
     echo Constants.TEAMS_MESSAGE
     echo config.message
  } else {
      echo Constants.TEAMS_MESSAGE
      echo config.message
  }
}
