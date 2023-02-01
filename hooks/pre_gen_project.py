import re
import sys

TERMINATOR = "\x1b[0m"
INFO = "\x1b[1;33m [INFO]: "
SUCCESS = "\x1b[1;32m [SUCCESS]: "
HINT = "\x1b[3;33m"
FAIL = "\033[91m [ERROR]"

PROJECT_NAME_REGEX = r'^[-a-zA-Z][-a-zA-Z0-9]+$'

project_name = '{{ cookiecutter.project_name|lower|replace(' ', '-') }}'

if not re.match(PROJECT_NAME_REGEX, project_name):
    print(FAIL + '"%s" is not a valid project_name because does not match the RegEx: ^[-a-zA-Z][-a-zA-Z0-9]+$ ' % project_name + TERMINATOR)

    # exits with status 1 to indicate failure
    sys.exit(1)
