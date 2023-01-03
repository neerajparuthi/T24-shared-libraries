import cg.t24.Constants

def call(Map config=[:]) {
  if (config.type == "teams") {
     echo Constants.TEAMS_MESSAGE
     echo config.message
     echo Constants.URL_WEBHOOK
    office365ConnectorSend Constants.URL_WEBHOOK
    
  } else {
      // office365ConnectorWebhooks([
       //     [name: "Office 365", url: Constants.URL_WEBHOOK, notifyBackToNormal: true, notifyFailure: true, notifyRepeatedFailure: true, notifySuccess: true, notifyAborted: true]
        // ])
      //echo config.message
  }
}
