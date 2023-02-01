from __future__ import print_function
from cookiecutter.main import cookiecutter

import os
import shutil
import yaml


TERMINATOR = "\x1b[0m"
INFO = "\x1b[1;33m [INFO]: "
SUCCESS = "\x1b[1;32m [SUCCESS]: "
HINT = "\x1b[3;33m"

def main():

    project_name = "{{ cookiecutter.project_name }}"
    project_slug = "{{ cookiecutter.project_slug }}"

    read_from_file = {{ cookiecutter._read_from_file }}

    resources_name = "{{ cookiecutter.resource_name }}"

    yaml_file = "../hid-project-generator/config.yaml"

    try:
        if read_from_file is True:
            with open(yaml_file, 'r') as stream:
                output = yaml.safe_load(stream)
                resources_name = output['resource_name']
        else:
            resources_name = resources_name.split(" ")
    except FileNotFoundError as ex:
        print("File not found")
        raise ex
    except yaml.YAMLError as ex:
        print("Error Reading file", yaml_file)
        raise ex
    except Exception as ex:
        print("Exception occurred while reading the file")
        raise ex


    templates_repo = "{{ cookiecutter._templates_repo }}"
    template_dir = os.path.join("templates")

    for resource in resources_name :
        cookiecutter(   templates_repo,
                        directory=template_dir,
                        no_input=True,
                        output_dir="..",
                        overwrite_if_exists=True,
                        extra_context={
                                        "project_name": project_name,
                                        "project_slug": project_slug,
                                        "resource_name": resource.capitalize()
                                      }
                    )

    print(SUCCESS +
          "Project initialized successfully! You can now jump to {} folder".
          format(project_slug) + TERMINATOR)
    print(INFO +
          "{}/README.md contains instructions on how to proceed.".
          format(project_slug) + TERMINATOR)

if __name__ == '__main__':
    main()
