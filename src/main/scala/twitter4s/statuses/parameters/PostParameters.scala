package twitter4s.statuses.parameters

import twitter4s.http.marshalling.Parameters

case class PostParameters(trim_user: Boolean) extends Parameters
