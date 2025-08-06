variable "region" {
  default = "ap-south-1"
}

variable "project_name" {
  default = "aws-demo-project"
}

variable "eb_app_name" {
  default = "aws-demo-project-api"
}

variable "eb_env_name" {
  default = "aws-demo-project-api-env"
}

variable "db_name" {
  default = "aws_demo_db"
}

variable "db_username" {
  default = "admin"
}

variable "db_password" {
  default = "admin123"
}

variable "docker_image" {
  description = "Docker image name for the application"
  type        = string
  default     = "my-springboot-app:latest"
}
