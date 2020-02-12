variable "key_name" {
  default = "sri"
}

variable "pvt_key" {
  default = "/home/mtadminnuvepro/.ssh/sri.pem"
}

variable "us-east-zones" {
  default = ["us-east-1a", "us-east-1b"]
}

variable "sg-id" {
  default = "sg-01eb4f696ab5fbaac"
}
