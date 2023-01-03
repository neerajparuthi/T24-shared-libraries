import cg.t24.Constants

def call(Map config=[:]) {
  if (config.type == "teams") {
     echo Constants.TEAMS_MESSAGE
     echo config.message
     office365ConnectorWebhooks([
            [name: "Office 365", url: Cnstants.URL_WEBHOOK, notifyBackToNormal: true, notifyFailure: true, notifyRepeatedFailure: true, notifySuccess: true, notifyAborted: true]
        ])
  } else {
      echo Constants.TEAMS_MESSAGE
      echo config.message
  }
}
