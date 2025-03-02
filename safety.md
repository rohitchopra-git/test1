## Step 1: Clone or Access the API Project

This command clones the API repository from a remote Git server (e.g., GitHub) to your local machine and navigates into the project directory.

```bash
git clone https://github.com/OT-MICROSERVICES/attendance-api.git
cd attendance-api
```

## Step 2: Install Python and pip (if not installed)

Check that Python 3 and pip (Python package manager) are installed on your system:

Check Python and pip versions:

```bash
python3 --version
pip3 --version
```

If Python or pip are not installed, you can install them by running the following commands:

```bash
sudo apt update
sudo apt install python3 python3-pip
```
## Step 3: Install System Dependencies for Database and Python Development


```bash
sudo apt install libpq-dev python3-dev -y
```

## Step 4: Set Up a Virtual Environment (Recommended)

It's a good practice to isolate your dependencies using a virtual environment.

4.1 Installs the python3-venv package, which is required to create virtual environments.

```bash
sudo apt install python3-venv
```
4.2 Creates a virtual environment named venv in the project directory to isolate project dependencies.

```bash
python3 -m venv venv
```
4.3 Sctivate the virtual environment, ensuring that all subsequent Python and pip commands use the isolated environment.

```bash
source venv/bin/activate
```

Once the environment is activated, your terminal prompt should change to indicate that you are inside the virtual environment.

## Step 5: Install Project Dependencies

If the project is having `requirements.txt`, you can install all the dependencies listed in that file:

Install dependencies from `requirements.txt`:

```bash
pip install -r requirements.txt
```

## Step 6 : Generate requirements.txt Using pipreqs (if not available)


If you want to generate a `requirements.txt` file based on the imports in your project, you can use the `pipreqs` tool.

**Step 6.1: Install `pipreqs`**

To install `pipreqs`, run the following command:

```bash
pip install pipreqs
```

**Step 6.2: Generate the `requirements.txt` File**

To generate the `requirements.txt` file, run the following command:

```bash
pipreqs . --force
```
This command scans the project directory for imported dependencies and generates a `requirements.txt` file in the current directory, overwriting any existing file.

---


## Step 7: Install Dependency Scanning Tools

Installs the safety tool for dependency scanning, which scans Python dependencies for known security vulnerabilities. It can installed using:

**Step 7.1: Generate the `requirements.txt` File**

```bash
pip install safety
```
**Step 7.2: Authenticate with Safety for Advanced Vulnerability Scanning**

```bash
safety auth login --headless
```

**Step 7.3: Steps to Complete Authentication**

- After runing the command safety auth login --headless.
Copy the provided URL and open it in a browser on your local machine.

- Log in to your Safety account (or create one if you don’t have an account).

- After logging in, you will receive a token. Paste this token back into the terminal when prompted.

This step explains how to log in to Safety in headless mode (without a browser).

**Step 7.4: Scan the repository**
After installing `safety`, you can run a security scan to identify any vulnerabilities in your project dependencies:

```bash
safety scan
```

After running Safety check i got a vulenerability that my pip version is not updated so we can upgrade the pip and run safety scan again and we got these results .



It states that there is no vulenrabilities reported .This ensure that your Python project dependencies are up-to-date, secure, and compatible.


---

**Step 8: Resolve Issues**

If the script identifies any outdated dependencies, you can update them using the following command:

```bash
pip install --upgrade <package_name>
```

If any security vulnerabilities are found, update the affected packages or follow the recommendations provided by the tools.
